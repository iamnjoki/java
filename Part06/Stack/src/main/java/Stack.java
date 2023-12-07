
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
public class Stack {
    ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(this.stack.isEmpty())
            return true;
        return false;
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        ArrayList<String> values = new ArrayList<>();
        
        for(String value : stack)
            values.add(value);
        return values;
    }
    
     public void val(){
        for(String v: stack)
            System.out.println(v);
    }
    
    public String take(){
        String toRemove = "";
        toRemove += stack.get(stack.size() - 1);
        this.stack.remove(toRemove);
        
        return toRemove;
    }
    
}
