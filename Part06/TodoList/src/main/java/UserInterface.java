
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
    private TodoList todolist = new TodoList();
    private Scanner scanner = new Scanner(System.in);
    
    public UserInterface(TodoList todo, Scanner scanner){
        this.todolist = todo;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true) {
            System.out.println("Command: ");
            String userInput = scanner.nextLine();
            
            if(userInput.equals("add")){
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();
                this.todolist.add(toAdd);
            }
            else if(userInput.equals("list")){
                this.todolist.print();
            }
            else if(userInput.equals("remove")){
                System.out.println("Which one to be removed? Enter index:");
                int toRemove = scanner.nextInt();
                this.todolist.remove(toRemove);
            }
            else if(userInput.equals("stop")){
                break;
            }
        }
    }
}
