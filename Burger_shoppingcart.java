import java.util.Scanner;

public class Burger_shoppingcart{
    public static void main (String[] args){
        String item;
        double price;
        int quantity;
        double total;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Item name: ");
        item = sc.nextLine();

        System.out.print("Enter the price: ");
        price = sc.nextDouble();

        System.out.print("Enter the quanity: ");
        quantity = sc.nextInt();

        total=quantity*price;

        System.out.print("Total amount for " + item + " is: " + total);

        sc.close();
    } 
}