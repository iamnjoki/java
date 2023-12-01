/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pak
 */
public class Team {
    private String homeName;
    private String visitingName;
    private int homePoints;
    private int visitingPoints;
    
    public Team(String homeName, String visitingName, int homePoints, int visitingPoints){
        this.homeName = homeName;
        this.visitingName = visitingName;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }
    
    public String getHomeTeamName(){
        return this.homeName;
    }
    
    public String getVisitingTeamName(){
        return this.visitingName;
    }
    
    public int getHomeTeamPoints(){
        return this.homePoints;
    }
    
    public int getVisitingTeamPoints(){
        return this.visitingPoints;
    }
    
   /* @Override
    public String toString(){
        return this.name;
    }*/
}
