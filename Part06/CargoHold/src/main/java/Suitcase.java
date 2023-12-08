
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int weight){
        this.items = new ArrayList<>();
        this.maxWeight = weight;
    }
    
    public void addItem(Item item){
        int totalWeight = 0;
        for(Item i : items){
            totalWeight += i.getWeight();
        }
        
        if((item.getWeight() + totalWeight <= this.maxWeight))
            this.items.add(item);
    }
    
    
    @Override
    public String toString(){
        int count = 0;
        int totalWeight = 0;
        
        for(Item item : items){
            count++;
            totalWeight += item.getWeight();
        }
        
        String elems = "";
        switch (count) {
            case 0:
                elems += "no items";
                break;
            case 1:
                elems += "item";
                break;
            default:
                elems += "items";
                break;
        }
        
        return "" + count + " " + elems + "(" + totalWeight + " kg)";
    }
    
    public void printItems(){
        items.forEach(i -> {
            System.out.println(i);
        });
    }
    
    
    public int totalWeight(){
        int totalWeight = 0;
        
        for(Item i : items){
            totalWeight += i.getWeight();
         }
        
        return totalWeight;
    }
    
    
    public Item heaviestItem(){
        if(items.isEmpty()) return null;
        
        int heaviest = items.get(0).getWeight();
        Item item = null ;
        
        for(Item i : items){
            if(i.getWeight() > heaviest){
                heaviest = i.getWeight();
                item = i;
            }
        }
        
        return item; 
    }
}
