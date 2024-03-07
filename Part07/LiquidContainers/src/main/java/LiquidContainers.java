
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        
        
         while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            System.out.println();
            System.out.println("Enter \"add(to first)\nmove(from first to second)\nremove(from second)\nand the amount,\nor quit\"");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            if (input.equals("quit")) {
                break;
            }
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
           
            if(command.equals("add")){
                if(first + amount > 100)
                   first = 100;
                else if((first + amount) <= 100 && amount > 0)
                    first += amount;
            }
            
            if(command.equals("move")){
                if(amount >= 0){
                     if(first - amount >= 0 && (second + amount) <= 100){
                        second += amount;
                        first -= amount;
                }
                
                else if(amount > first && (second + first) <= 100){
                    second += first;
                    first = 0;
                }
                
                else if(second + amount > 100){
                    if(second + first > 100)
                        second = 100;
                }
                     else first -= amount;
                }
            }
           
            if(command.equals("remove")){
                if(amount > second)
                    second = 0;
                else second -= amount;
            }
        }
    }    

}
