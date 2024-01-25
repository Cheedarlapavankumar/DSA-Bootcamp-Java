import java.util.Scanner;

public class sumOfNumberUsingFunctionU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("NUmber Sums Calculator: ");
        System.out.println("Enter a list of numbers,Enter o to terminate the list ");
        int num;
        int sumOfNegative = 0;
        int sumOfEvenPositive = 0;
        int sumOfPositiveOdd = 0;
        do{
            System.out.println("Enter a number: ");
            num = input.nextInt();
            if(num<0){
                sumOfNegative = addToSum(sumOfNegative,num);

            } else if (isEven(num)) {
                sumOfEvenPositive =addToSum(sumOfEvenPositive,num);

            }
            else  {
                sumOfEvenPositive = addToSum(sumOfPositiveOdd,num);

            }
        }while(num !=0);
        printResults(sumOfPositiveOdd,sumOfNegative,sumOfEvenPositive);
    }
    public static int addToSum(int currentSum,int number){
        return currentSum+number;
    }
    public static boolean isEven(int number){
        return number % 2  == 0;

        }
    public static void printResults(int sumOfNegative, int sumOfEvenPositive, int sumOfPositiveOdd ){
        System.out.println("\nResult: ");
        System.out.println("Sum of negative numbers: " + sumOfNegative);
        System.out.println("sum of even positive numbers: " + sumOfEvenPositive);
        System.out.println("sum of positive odd numbers: " +  sumOfPositiveOdd);
    }





}
