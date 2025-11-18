import java.util.Scanner;

public class Email_extractor{
    public static void main(String[] args){
        Scanner email = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String user_email = email.nextLine();

        if (user_email.contains("@")){
            String username = user_email.substring(0,user_email.indexOf("@"));
            String domain = user_email.substring(user_email.indexOf("@")+1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        }
        else{
            System.out.println("Invalid Email");
        }

        email.close();
    }
}
