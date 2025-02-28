import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExample_1 {
    public static void main(String[] args) {
        // Create an array with 100 randomly chosen integers
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000); // Random integers between 0 and 999
        }

        // Prompt the user to enter the index of the array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the array:");
        
        try {
            int index = scanner.nextInt();
            
            // Display the corresponding element value
            System.out.println("Element at index " + index + ": " + array[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Display "Out of Bounds" if the index is invalid
            System.out.println("Out of Bounds");
        }
        
        scanner.close();
    }
}
