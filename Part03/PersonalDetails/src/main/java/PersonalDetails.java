
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = "";
        int longestNameLength = 0;
        int sumYears = 0;
        double average = 0.0;
        int yearsEntered = 0;
        
        while(true){
            String userInput = scanner.nextLine();
            
            if(userInput.isBlank())
                break;
            
            String[]arr = userInput.split(",");
            
            int year = Integer.valueOf(arr[1]);
            sumYears += year;
            yearsEntered++;
            
            
            int nameLength = arr[0].length();
            if(nameLength > longestNameLength){
                longestNameLength = nameLength;
                longestName = arr[0];
            }
           
        }
        average = (sumYears * 1.0) / yearsEntered;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
