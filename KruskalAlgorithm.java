// Write a program to find minimum cost spanning tree using Kruskal’s Algorithm.
import java.util.*;

public class KruskalAlgorithm {
    static int[] parent, rank;

    public static void main(String[] args) {
        int V = 4;
        Edge[] edges = {
            new Edge(0, 1, 10), new Edge(0, 2, 6), new Edge(0, 3, 5),
            new Edge(1, 3, 15), new Edge(2, 3, 4)
        };
        kruskalMST(V, edges);
    }

    static class Edge implements Comparable<Edge> {
        int src, dest, weight;
        Edge(int src, int dest, int weight) { this.src = src; this.dest = dest; this.weight = weight; }
        public int compareTo(Edge e) { return this.weight - e.weight; }
    }

    static int find(int i) { return parent[i] == i ? i : (parent[i] = find(parent[i])); }
    
    static void union(int x, int y) {
        int rootX = find(x), rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) parent[rootY] = rootX;
            else if (rank[rootX] < rank[rootY]) parent[rootX] = rootY;
            else { parent[rootY] = rootX; rank[rootX]++; }
        }
    }

    static void kruskalMST(int V, Edge[] edges) {
        parent = new int[V]; rank = new int[V];
        Arrays.setAll(parent, i -> i); Arrays.sort(edges);
        
        int mstWeight = 0;
        for (Edge e : edges) {
            if (find(e.src) != find(e.dest)) {
                System.out.println(e.src + " - " + e.dest + " : " + e.weight);
                mstWeight += e.weight;
                union(e.src, e.dest);
            }
        }
        System.out.println("MST Weight: " + mstWeight);
    }
}

// Time Complexity: O(E log E)
// Space Complexity: O(V)
//output:  2 - 3 : 4
//         0 - 3 : 5
//         0 - 1 : 10
//         MST Weight: 19