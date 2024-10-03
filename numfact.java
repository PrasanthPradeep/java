import java.util.Scanner;

public class numfact {
    
    public static long factorialIterative(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {

            long iterativeResult = factorialIterative(number);
            
            System.out.println("Factorial of " + number + ": " + iterativeResult);
        }
        
        scanner.close();
    }
}
