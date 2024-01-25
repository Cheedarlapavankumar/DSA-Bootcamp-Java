import java.util.Scanner;

public class EvenDaysWithVoidFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days in August: ");
        int dayInAugust = scanner.nextInt();

        printEvenDays(dayInAugust);
    }

    public static void printEvenDays(int days) {
        int count = 0;
        System.out.println("Kunal can go out on even days in August:");
        for (int day = 2; day <= days; day += 2) {
            count++;
            System.out.println("Day " + day);
        }
        System.out.println("Total days Kunal can go out in August: " + count);
    }
}

