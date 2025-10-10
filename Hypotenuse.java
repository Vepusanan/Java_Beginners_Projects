import java.util.Scanner;

public class Hypotenuse{
    public static void main(String[] args){
        Scanner length = new Scanner(System.in);
        double a,b,c;

        System.out.print("Enter the length of Side A: ");
        a = length.nextDouble();

        System.out.print("Enter the length of Side B: ");
        b = length.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.print("Length of Hypotenuse is : " + c);

        length.close();
    }
}