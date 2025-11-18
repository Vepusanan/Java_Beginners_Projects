import java.util.Scanner;

public class Temperature_converter {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        double temp;
        String unit;

        System.out.print("Enter the value of temperature: ");
        temp = sc.nextDouble();

        System.out.print("Conver to Celius or Fahrenheit? (C or F)? ");
        unit = sc.next().toUpperCase();

        double value = (unit.equals("C"))? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("%.2f degree %s", value, unit);

        sc.close();
    }
}
