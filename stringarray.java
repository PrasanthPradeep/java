import java.util.Scanner;

public class stringarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Display the contents of the character array
        System.out.println("The character array contains:");
        for (char c : charArray) {
            System.out.println(c);
        }

        // Close the scanner
        scanner.close();
    }
}
