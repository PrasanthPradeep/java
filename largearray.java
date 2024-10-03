import java.util.Scanner;

public class largearray {
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

        // Find the largest element
        int largest = array[0]; // Assume the first element is the largest
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i]; // Update largest if current element is greater
            }
        }

        // Display the largest element
        System.out.println("The largest element in the array is: " + largest);

        // Close the scanner
        scanner.close();
    }
}
