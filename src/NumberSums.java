import java.util.Scanner;

public class NumberSums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number Sums Calculator");
        System.out.println("Enter a list of numbers. Enter 0 to terminate the list.");
        int num;
        int sumOfNegative = 0;
        int sumOfEvenPositive = 0;
        int sumOfPositiveOdd = 0;

        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if(num<0){
                sumOfNegative = sumOfNegative + num;
                }else if (num % 2 == 0){
                sumOfEvenPositive = sumOfEvenPositive + num;
            }else{
                sumOfPositiveOdd = sumOfPositiveOdd + num;

            }
        }while (num != 0);
        System.out.println("\nResults:");
        System.out.println("Sum of negative numbers: " + sumOfNegative);
        System.out.println("Sum of positive even numbers: " + sumOfEvenPositive);
        System.out.println("Sum of positive odd numbers: " + sumOfPositiveOdd);
    }
}
