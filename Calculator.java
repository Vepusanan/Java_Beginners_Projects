import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double num1,num2;
        double answer = 0;
        char op ;
        boolean valid = true;
        
        System.out.print("Enter your first number: ");
        num1 = sc.nextDouble();

        System.out.print("Chooe the operator (+ , - , * , / , ^): ");
        op = sc.next().charAt(0);

        System.out.print("Enter your second number: ");
        num2 = sc.nextDouble(); 

        switch (op) {
            case '+' -> answer = num1 + num2;
            case '-' -> answer = num1 - num2;
            case '*' -> answer = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    answer = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    valid = false;
                }
            }
            case '^' -> answer = Math.pow(num1, num2);
            default -> { 
                System.out.println("Invalid Operator");
                valid = false;
            }
        }

        if(valid){
            System.out.println("Answer is: " + answer);
        }

        sc.close();
        
    }
}
