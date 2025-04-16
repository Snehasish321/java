import java.util.Scanner;

public class Scanner1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enterr your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name );
    }
}
