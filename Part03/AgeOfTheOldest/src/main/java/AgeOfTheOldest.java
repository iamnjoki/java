
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter name & age seperated by a comma. Empty input stops the programm.");
        
        int oldest = 0;
        
        while(true){
        String userInput = scanner.nextLine();
        
        if(userInput.isBlank())
            break;
        
        String[] input = userInput.split(",");
        int age = Integer.valueOf(input[1]);
        
         if(age > oldest){
            oldest = age;
        }
         
       }
        System.out.println("Age of the oldest: " + oldest);
    }
}
