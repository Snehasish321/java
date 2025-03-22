//	Write a program to find minimum cost spanning tree using Prim’s Algorithm.
import java.util.Arrays;

public class PrimsAlgorithm {
    static final int V = 5;

    public static void main(String[] args) {
        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };
        primMST(graph);
    }

    static void primMST(int[][] graph) {
        int[] parent = new int[V], key = new int[V];
        boolean[] mstSet = new boolean[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    key[v] = graph[u][v];
                    parent[v] = u;
                }
            }
        }

        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + " - " + i + " \t" + graph[i][parent[i]]);
    }

    static int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
}

// Time Complexity: O(V^2)
// Space Complexity: O(V)
//output:  0 - 1 	2
    //     1 - 2 	3
    //     0 - 3 	6
    //     2 - 4 	5