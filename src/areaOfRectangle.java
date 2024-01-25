import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the Rectangle: ");
        double width = input.nextDouble();
        double area = calculateOfRectangle(length , width);
        System.out.println("The area of Rectangle with length" + length + " and width " + " is: " + area);
    }
    public static double calculateOfRectangle(double length , double width){
        return length*width;
    }
}
