import java.util.Scanner;

public class largeofthree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Find the largest number
        int largest = num1; // Assume num1 is the largest

        if (num2 > largest) {
            largest = num2; // Update largest if num2 is greater
        }
        if (num3 > largest) {
            largest = num3; // Update largest if num3 is greater
        }
        
        System.out.println("The largest number is: " + largest);
        
        scanner.close();
    }
}
