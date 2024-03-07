
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username: ");
        String username = scanner.nextLine().toLowerCase();
        
        System.out.println("Enter password: ");
        String password = scanner. nextLine().toLowerCase();
        
        if(username.equals("alex") && password.equals("sunshine") ||
            username.equals("emma") && password.equals("haskell")){
            System.out.println("You have successfully logged in!");
        }else
            System.out.println("Icorrect username or password!");
    }
}
