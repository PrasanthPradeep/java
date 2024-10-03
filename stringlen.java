import java.util.Scanner;

public class stringlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the length of the string
        int length = inputString.length();

        // Display the length of the string
        System.out.println("The length of the entered string is: " + length);

        // Close the scanner
        scanner.close();
    }
}
