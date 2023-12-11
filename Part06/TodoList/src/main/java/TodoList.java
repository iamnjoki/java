
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pak
 */
public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList(){
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task){
        this.todoList.add(task);
    }
    
    public void print(){
        int i = 1;
        for(String s : todoList){
            System.out.println(i + ": " + s);
            i++;
        }
    }
    
    public void remove(int number){
        for(int i = 0; i < this.todoList.size(); i++){
            if(i == (number - 1))
                this.todoList.remove(i);
        }
        
    }
}
