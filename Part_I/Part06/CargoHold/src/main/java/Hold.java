
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
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    
    public Hold(int weight){
        this.suitcases = new ArrayList<>();
        this.maxWeight = weight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int totalWeight = 0;
       
        for(Suitcase s : suitcases){
            totalWeight += s.totalWeight();
        }
        if(totalWeight + suitcase.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    
    @Override
    public String toString(){
        int count = 0; 
        int totalWeight = 0;
        
        for(Suitcase s : suitcases){
            count++;
            totalWeight += s.totalWeight();
        }
        
        return "" + count + " suitcases " + "(" + totalWeight + " kg)";
    }
    
    
    public void printItems(){
        for(Suitcase s : suitcases){
            s.printItems();
        }
    }
}
