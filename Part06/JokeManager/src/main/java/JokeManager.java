
import java.util.ArrayList;
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
public class JokeManager {
    private ArrayList<String> jokes;
    
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);  
    }
    
    public String drawJoke(){
        Random rand = new Random();
        
        int i = rand.nextInt(this.jokes.size());
        return this.jokes.get(i);
    }
    
    public void printJokes(){
        for(String j : jokes)
            System.out.println(j);
    }
    
}
