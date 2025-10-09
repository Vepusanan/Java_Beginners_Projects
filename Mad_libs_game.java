import java.util.Scanner;

public class Mad_libs_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Mad Libs Game!");
        System.out.println("Please provide the following words:");

        System.out.print("Enter a name: ");
        String name=sc.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective=sc.nextLine();
        
        System.out.print("Enter a noun: ");
        String noun=sc.nextLine();

        System.out.print("Enter a verb: ");
        String verb=sc.nextLine();

        System.out.print("Enter a place: ");
        String place=sc.nextLine();

        System.out.println("Once upon a time, there was a person named " + name + 
                            ". They were very " + adjective + " and loved their " + noun +
                            ". Every day, they would " + verb + " at the " + place +
                        ". And everyone in the town admired their " + adjective + " ways!");

        sc.close();
    }
}