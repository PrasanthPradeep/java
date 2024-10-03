import java.util.Scanner;

public class stringcomp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Compare the two strings for equality
        if (firstString.equals(secondString)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
            // Compare lengths
            if (firstString.length() > secondString.length()) {
                System.out.println("The first string is longer than the second string.");
            } else if (firstString.length() < secondString.length()) {
                System.out.println("The second string is longer than the first string.");
            } else {
                System.out.println("The strings have the same length but are not equal.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
