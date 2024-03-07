
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter name & age seperated by a comma. Empty input stos the program");
        
        int oldest= 0;
        String nameOfTheOldest = "";
        
        while(true){
            String userInput = scanner.nextLine();
            
            if(userInput.isBlank())
                break;
            
            String[] input = userInput.split(",");
            
            int age = Integer.valueOf(input[1]);
            
            if(age > oldest){
                oldest = age;
                nameOfTheOldest = input[0];
            }
        }
            
        System.out.println("Name of the oldest: " + nameOfTheOldest);
    }
}
