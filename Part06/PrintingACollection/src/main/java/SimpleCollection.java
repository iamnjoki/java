
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pak
 */
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        String output = "";
        String e = "";
        
        if(this.elements.size() == 1) e = "element";
        if(this.elements.size() > 1) e = "elements";
        
        if(this.elements.isEmpty())
            return output += "The collection " + this.name + " is empty.";
        
        
        String listItems = "";
        
        for(String elem : elements){
            listItems += elem + "\n";
        }
        
        return output += "The collection " + this.name + " has " + elements.size() + " " + e +":" + "\n" + listItems;
        
    }
}
