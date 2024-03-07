
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
public class BirdsList {
    private ArrayList<Bird> birds;
    
    
    public BirdsList(){
        this.birds = new ArrayList<>();
    }
    
    
    public void addBird(String name,  String latinName){
        this.birds.add(new Bird(name, latinName));
    }
    
    
    public void showAllBirds(){
        for(Bird b : birds){
            System.out.println(b);
        }
    }
    
    
    public void showOneBird(String bird){
        for(Bird b : this.birds){
            if(b.getName().equals(bird)){
                System.out.println(b);
            }
        }
    }
    
    
    public boolean checkIfBird(String str){
        boolean isBird = false;
        for(Bird b : this.birds){
            if(b.getName().equals(str)){
                isBird = true;
            }
        }
        return isBird;
    }
    
    public int observation(String name){
        int viewCount = 0;
        for(Bird b : this.birds){
            if(b.getName().equals(name)){
              viewCount =  b.observations();
            }
        }
        
        return viewCount;
    } 
    
}
