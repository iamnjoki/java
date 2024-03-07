
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
public class Package {
    private ArrayList<Gift> gifts;
    
    
    public Package(){
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        
        totalWeight = gifts.stream()
                .map(gift -> gift.getWeight())
                .reduce(totalWeight, Integer::sum);
        
        return totalWeight;
    }
    
    public void allGifts(){
        this.gifts.forEach(g -> {
            System.out.println("Gift name: " + g.getName() + "\nGift weight: " + g.getWeight() + " kg");
        });
    }
}
