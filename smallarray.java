import java.util.Scanner;

public class smallarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] array = new int[n];

        // Read the elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the smallest element
        int smallest = array[0]; // Assume the first element is the smallest
        for (int i = 1; i < n; i++) {
            if (array[i] < smallest) {
                smallest = array[i]; // Update smallest if current element is smaller
            }
        }

        // Display the smallest element
        System.out.println("The smallest element in the array is: " + smallest);

        // Close the scanner
        scanner.close();
    }
}
