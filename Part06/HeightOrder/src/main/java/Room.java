
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
public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        persons.add(person);
    }
    
    public boolean isEmpty(){
        if(persons.isEmpty()) return true;
        
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        ArrayList personsList = new ArrayList<>();
        
        for(Person p : persons){
            personsList.add(p);
         }
        
        return personsList;
    }
    
    public Person shortest(){
        if(persons.isEmpty()) return null;
        
        Person shortestPerson = persons.get(0);
        
        for(Person s : persons){
            if(s.getHeight() < shortestPerson.getHeight())
             shortestPerson = s;
            }
        
        return shortestPerson;
    }
    
    public Person take(){
        if(persons.isEmpty()) return null;
        
        int toRemove = persons.indexOf(shortest());
        return persons.remove(toRemove);
    }
    
}
