import java.util.Scanner;

public class sumrev {

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits is: " + sum);
        
        int reversed = reverseNumber(number);
        System.out.println("The reverse of the number is: " + reversed);
        
        scanner.close();
    }
}
