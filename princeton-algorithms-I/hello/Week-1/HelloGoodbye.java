import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first name
        System.out.print("Enter the first name: ");
        String name1 = scanner.nextLine();

        // Prompt the user for the second name
        System.out.print("Enter the second name: ");
        String name2 = scanner.nextLine();

        // Print the hello message
        System.out.println("Hello " + name1 + " and " + name2 + ".");

        // Print the goodbye message
        System.out.println("Goodbye " + name2 + " and " + name1 + ".");
    }
}
