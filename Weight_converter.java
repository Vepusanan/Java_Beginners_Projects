import java.util.Scanner;

public class Weight_converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight, newWeight ;
        int choice; 

        System.out.println("Welcome to weight converter");
        System.out.println("1 for lbs to kg");
        System.out.println("2 for kg to lbs");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = sc.nextDouble();

            newWeight = weight * 0.453592;
            System.out.printf("Weight in kg: %.2f", newWeight);
        } 
        else if (choice == 2) {
            System.out.print("Enter weight in kg: ");
            weight = sc.nextDouble();
        
            newWeight = weight / 0.453592;
            System.out.printf("Weight in lbs: %.2f", newWeight);
        } 
        else {
            System.out.println("Invalid choice");
        }



        sc.close();
    }
}
