import java.util.Scanner;

public class Circle_sphere{
    public static void main (String[] args){
        Scanner rad = new Scanner(System.in);
        
        double radius,area,circumference,volume;

        System.out.print("Enter the value of the radius: ");
        radius = rad.nextDouble();
        
        circumference = 2 * Math.PI * radius; 
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);

        System.out.println("Circumference of circle with radius " + radius + " units is " + circumference + " units");
        System.out.println("Area of circle with radius " + radius + " units is " + area + " sqaure units");
        System.out.println("Volume of sphere with radius " + radius + " units is " + volume + " cubic units");

        rad.close();
    }
}