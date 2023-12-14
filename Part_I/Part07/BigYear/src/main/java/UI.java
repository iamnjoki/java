
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
public class UI {
    private Scanner scan;
    BirdsList birdsList = new BirdsList();
    
    public UI(){
        this.scan = new Scanner(System.in);
    }
    
    public void start(){
        
        while(true){
            System.out.println("?");
            String command = scan.nextLine();
            
            if(command.equals("Quit")) break;
            
            if(command.equals("Add")){
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                
                this.birdsList.addBird(name, latinName);
            }
            
            if(command.equals("Observation")){
                System.out.println("Bird? ");
                String bird = scan.nextLine();
                
                if(!this.birdsList.checkIfBird(bird)){
                    System.out.println("Not a bird!");
                }
                else this.birdsList.observation(bird);
                
            }
            
            if(command.equals("All"))
                this.birdsList.showAllBirds();
            
            if(command.equals("One")){
                System.out.println("Bird? ");
                String bird = scan.nextLine();
                this.birdsList.showOneBird(bird);
            }
                
            
        }
    }
    
}
