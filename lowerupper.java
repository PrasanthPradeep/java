import java.util.Scanner;

public class lowerupper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a lowercase string
        System.out.print("Enter a lowercase string: ");
        String lowercaseString = scanner.nextLine();

        // Convert the string to uppercase
        String uppercaseString = lowercaseString.toUpperCase();

        // Display the converted string
        System.out.println("Uppercase string: " + uppercaseString);

        // Close the scanner
        scanner.close();
    }
}
