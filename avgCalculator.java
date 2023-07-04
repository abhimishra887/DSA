import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter a list of numbers (enter -1 to finish):");

        int number;
        do {
            number = scanner.nextInt();
            if (number != -1) {
                numbers.add(number);
            }
        } while (number != -1);

        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
        } else {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }

            double average = (double) sum / numbers.size();
            System.out.println("Average: " + average);
        }
    }
}
