
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scanner.nextLine();
        
        System.out.println("Team:");
        String teamNameInput = scanner.nextLine();
       
         
        ArrayList<Team> teams = new ArrayList<>();
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                
                String[] parts = row.split(",");
                
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                teams.add(new Team(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
       
        int totalGames = 0;
        int wins = 0;
        int losses = 0;
        
        for(Team t : teams){
            if(t.getHomeTeamName().equalsIgnoreCase(teamNameInput) 
                    || 
               t.getVisitingTeamName().equalsIgnoreCase(teamNameInput)){
                totalGames++;
            }
            
             if(t.getHomeTeamName().equalsIgnoreCase(teamNameInput)
                 && t.getHomeTeamPoints() > t.getVisitingTeamPoints() 
                     ||
                t.getVisitingTeamName().equalsIgnoreCase(teamNameInput)
                && t.getVisitingTeamPoints() > t.getHomeTeamPoints()){
                    
                    wins++;
                    losses = totalGames - wins;
            }
            
        }
       System.out.println("Games: " + (totalGames) + "\nWins: " + wins + "\nLosses: " + losses);
      }

}
