
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
public class Statistics {
    private ArrayList<Integer> pointsList;
    
    public Statistics(){
        this.pointsList = new ArrayList<>();
    }
    
    public void addPoints(int points){
            pointsList.add(points);
    }
    
    public double avg(){
        int numOfTests = this.pointsList.size();
        int totalPoints = 0;
                
        for(int p : this.pointsList){
            totalPoints += p;
        }
        
        return (1.0 * totalPoints / numOfTests);
    }
    
    
        
    public String passAvg(){
        int pass = 0;
        int count = 0;
        String res = "";
        
        for(int p : this.pointsList){
            if(p >= 50){
                pass += p;
                count++;
            }
        }
        if(count >= 1) res = ""  + 1.0 * pass / count;
        else res = "-";
        
        return res;
    }
    
    
    public double passPercentage(){
        int totalParticipants = this.pointsList.size();
        int countPass = 0;
        
        for(int p : this.pointsList){
            if(p >= 50)
                countPass++;
        }
        
        return 1.0 * 100 * countPass / totalParticipants;
    }
    
    public void gradeDistribution(){
        ArrayList<Integer> stars = new ArrayList<>();
       
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;
        
        for(int p : pointsList){
            if(p < 50){
                grade0++;
            }
            else if(p < 60){
               grade1++;
            }
            else if(p < 70){
                grade2++;
            }
            else if(p < 80){
               grade3++;
            }
            else if(p < 90){
                grade4++;
            }
            else{
                grade5++;
            }
            
        }
        
        stars.add(grade5);
        stars.add(grade4);
        stars.add(grade3);
        stars.add(grade2);
        stars.add(grade1);
        stars.add(grade0);
      
        
        int n = 5;
        for(int i = 0; i < stars.size(); i++){
            System.out.print(n-- +":");
            for(int j = stars.get(i); j >= 1; j--)
            System.out.print("*");
         System.out.println("");
        }
    }
    

    @Override
    public String toString(){
        return "Point average (all): " + avg() + "\n"
                + "Point average (passing): " + passAvg() + 
                    "\nPass percentage: " + passPercentage();
    }
}
