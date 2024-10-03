import java.util.Scanner;

public class stringcpy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Copy the original string to a new string variable
        String copiedString = originalString;

        // Display both strings
        System.out.println("Original String: " + originalString);
        System.out.println("Copied String: " + copiedString);

        // Close the scanner
        scanner.close();
    }
}
