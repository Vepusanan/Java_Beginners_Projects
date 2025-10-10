import java.util.Scanner;

public class Compound_interest_calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double principal, rate, timecompound, amount;
        int years;

        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = sc.nextDouble() / 100;

        System.out.print("Enter the no of times coumpouded per year: ");
        timecompound = sc.nextDouble();

        System.out.print("Enter the no of years: ");
        years = sc.nextInt();

        amount = principal * ( Math.pow ((1 + (rate/timecompound)) , years * timecompound) ) ;

        System.out.printf("The amount after %d years is %,.2f", years , amount);

        sc.close();
    }
}