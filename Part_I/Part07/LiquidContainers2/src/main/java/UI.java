
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pak
 */
public class UI {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();
        
        public void start(){
        
        while(true){
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            System.out.println();
            System.out.println("Enter \"add(to first)\nmove(from first to second)\nremove(from second)\nand the amount,\nor quit\"");
            System.out.println();
            
            String input = scan.nextLine();
            if (input.equals("quit")) 
                break;
            
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
                first.add(amount);
            }
            
            if(command.equals("remove")){
                second.remove(amount);
            }
            
            if(command.equals("move")){
                if(amount >= 0){
                    if(first.contains() - amount >= 0 && (second.contains() + amount) <= 100){
                        second.add(amount);
                        first.remove(amount);
                }
                
                else if(amount > first.contains() && (second.contains() + first.contains()) <= 100){
                    second.add(first.contains());
                    first.remove(first.contains());
                }
                
                else if(second.contains() + amount > 100){
                    if(second.contains() + first.contains() > 100)
                        second.add(100);
                }
                     else first.remove(amount);
                }
            }
        }
    }
}
