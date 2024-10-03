import java.util.Scanner;

public class seclarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Check if there are at least two elements
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Initialize the array
        int[] array = new int[n];

        // Read the elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize the first and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second largest elements
        for (int i = 0; i < n; i++) {
            if (array[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = array[i];      // Update largest
            } else if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i]; // Update second largest
            }
        }

        // Check if the second largest was found
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }

        // Close the scanner
        scanner.close();
    }
}
