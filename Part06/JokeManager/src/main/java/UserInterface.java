
import java.util.Locale;
import java.util.Random;
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
public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true) {
            System.out.println(
                    "Commands: \n1 - add a joke\n" +
                    "2 - draw a joke\n" +
                    "3 - list jokes\n" +
                    "X - stop");
            
            String command = scanner.nextLine();
            
            if(command.equals("1")){
                System.out.println("Write the joke to be added: ");
                String joke = scanner.nextLine();
                manager.addJoke(joke);
            }
                
            else if(command.equals("2")){
                if(this.manager.drawJoke().isEmpty())
                    System.out.println("Jokes are in short supply.");
                  
                else System.out.println("Drawing a joke.");
                System.out.println(manager.drawJoke());
            }
            
            else if(command.equals("3")){
                System.out.println("Printing the jokes.");
                manager.printJokes();
            }
            
            else if(command.equals("X")) break;
        }
    }
}
