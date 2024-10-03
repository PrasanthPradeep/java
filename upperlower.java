import java.util.Scanner;

public class upperlower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an uppercase string
        System.out.print("Enter an uppercase string: ");
        String uppercaseString = scanner.nextLine();

        // Convert the string to lowercase
        String lowercaseString = uppercaseString.toLowerCase();

        // Display the converted string
        System.out.println("Lowercase string: " + lowercaseString);

        // Close the scanner
        scanner.close();
    }
}
