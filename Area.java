import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner measurements = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        double length = measurements.nextDouble();

        System.out.print("Enter the width: ");
        double width = measurements.nextDouble();

        double area = length * width;
        System.out.println("The area of the rectangle is: " + area + "sqaure units");
        measurements.close();
    }
}