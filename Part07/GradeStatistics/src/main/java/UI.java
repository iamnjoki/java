
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
    Statistics stats;
    
    public UI(){
        this.scan = new Scanner(System.in);
        this.stats = new Statistics();
    }
    
    
    public void start(){
        System.out.println("Enter point totals, -1 stops");
        while(true){
            int points = scan.nextInt();
            if(points == -1) break;
            
            if(!(points < 0) && !(points > 100))
                stats.addPoints(points);
        }
        
        System.out.println(stats);
        stats.gradeDistribution();
    }
   
    
}
