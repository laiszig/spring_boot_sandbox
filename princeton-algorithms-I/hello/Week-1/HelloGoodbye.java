public class HelloGoodbye {
    public static void main(String[] args) {
        // Using System.console() to read input from the user
        java.io.Console console = System.console();

        if (console == null) {
            System.err.println("No console available");
            return;
        }

        // Prompt the user for the first name
        String name1 = console.readLine("Enter the first name: ");

        // Prompt the user for the second name
        String name2 = console.readLine("Enter the second name: ");

        // Print the hello message
        System.out.println("Hello " + name1 + " and " + name2 + ".");

        // Print the goodbye message
        System.out.println("Goodbye " + name2 + " and " + name1 + ".");
    }
}


