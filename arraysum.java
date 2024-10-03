import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the arrays: ");
        int size = scanner.nextInt();
        
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] sumArray = new int[size];
        
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        System.out.println("The sum of the two arrays is:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + sumArray[i]);
        }
        
        scanner.close();
    }
}
