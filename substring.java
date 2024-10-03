import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt the user to enter the substring to search for
        System.out.print("Enter the substring to search for: ");
        String substring = scanner.nextLine();

        // Check if the substring is present in the main string
        if (mainString.contains(substring)) {
            System.out.println("The substring \"" + substring + "\" is found in the main string.");
        } else {
            System.out.println("The substring \"" + substring + "\" is not found in the main string.");
        }

        // Close the scanner
        scanner.close();
    }
}
