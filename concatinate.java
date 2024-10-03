import java.util.Scanner;

public class concatinate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate the two strings
        String concatenatedString = firstString + " " + secondString;

        // Display the concatenated string
        System.out.println("Concatenated String: " + concatenatedString);

        // Close the scanner
        scanner.close();
    }
}
