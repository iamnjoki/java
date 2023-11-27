/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pak
 */
public class Dog {
    private String name;
    private String breed;
    private int age;
    
    public Dog(String aName, String aBreed, int aAge){
        this.name = aName;
        this.breed = aBreed;
        this.age = aAge;
    }
    
    public String dogBarks(){
        return "Ghu!!! ghu!!! ghu!!!";
    }
    
    @Override
    public String toString(){
        return "My dog's name is " + this.name + ", a breed of " + this.breed + ", & it's " + this.age + " years old.";
    }
}
