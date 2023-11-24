
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        ArrayList<Integer> userInput = new ArrayList<>();
       
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999)
                break;
            
            userInput.add(input);
        }
        
        ArrayList<Integer> indices = new ArrayList<>();
        int smallest = userInput.get(0);
        
        for(int i = 0; i < userInput.size(); i++){
            if(userInput.get(i) < smallest){
                smallest = userInput.get(i);
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for(int j = 0; j < userInput.size(); j++){
           if(userInput.get(j) == smallest)
                System.out.println("Found at " + j);
        }
    }
    
    
}
