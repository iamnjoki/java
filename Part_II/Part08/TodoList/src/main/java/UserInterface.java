
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
    private TodoList todolist;
    private Scanner scan;
    
    public UserInterface(TodoList todolist, Scanner scan){
        this.todolist = todolist;
        this.scan = scan;
    }
     
    public void start(){
        
        while (true){
            System.out.println("Command: ");
            String command = scan.nextLine();
            
            if(command.equals("stop")) break;
            
            if(command.equals("add")){
                System.out.println("To add: ");
                String task = scan.nextLine();
                
                this.todolist.add(task);
            }
            
            if(command.equals("list")){
                this.todolist.print();
            }
            
            if(command.equals("completed")){
                System.out.println("Which task was completed?");
                int taskCompleted = scan.nextInt();
                
               this.todolist.completed(taskCompleted);
               this.todolist.remove(taskCompleted);
            }
            
            if(command.equals("remove")){
                System.out.println("Which one to be removed? ");
                int toRemove = scan.nextInt();
                
                this.todolist.remove(toRemove);
            }
        }
    }
}
