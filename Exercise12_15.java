import java.io.*;
import java.util.*;

public class Exercise12_15 {
    public static void main(String[] args) {
        // Generate 100 random integers and write them to "Exercise12_15.txt"
        try (PrintWriter writer = new PrintWriter(new FileWriter("Exercise12_15.txt"))) {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int number = random.nextInt(1000); // Random integers between 0 and 999
                writer.print(number + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the integers from the file and store them in an ArrayList
        List<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("Exercise12_15.txt"))) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Sort the integers in increasing order
        Collections.sort(numbers);

        // Display the sorted integers
        System.out.println("Sorted integers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

