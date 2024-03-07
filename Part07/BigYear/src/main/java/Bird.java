/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pak
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    
    public Bird(String name, String lName){
        this.name = name;
        this.latinName = lName;
        this.observations = 0;
    }
    
    public String getName(){
        return this.name;
    } 
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public int observations(){
       return  this.observations++;
    }
    
    @Override
    public String toString(){
        return this.name + "(" + this.latinName + "): " + this.observations + " observations";
    }
     
}
