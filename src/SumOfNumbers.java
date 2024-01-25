import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (enter 0 to stop):");

        int sum = getSumOfNumbers(scanner);

        System.out.println("Sum of numbers: " + sum);

        scanner.close();
    }

    private static int getSumOfNumbers(Scanner scanner) {
        int sum = 0;
        int userInput;

        while (true) {
            System.out.print("Enter a number: ");
            userInput = scanner.nextInt();

            if (userInput == 0) {
                break;
            }

            sum += userInput;
        }

        return sum;
    }
}
