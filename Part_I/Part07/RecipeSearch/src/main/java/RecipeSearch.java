
import java.util.Scanner;



public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File to read: ");
        String fileToRead = scan.nextLine();
        
        Recipes recipes = new Recipes();
        recipes.readRecipes(fileToRead);
        System.out.println();
        
        System.out.println("Commands: \nlist - lists the recipes\nstop - stops the program\n");
        
        while(true){
            System.out.println();
            System.out.println("Enter command: ");
            String command = scan.nextLine();
            System.out.println();
            
            if(command.equals("stop")) break;
            
            if(command.equals("list")){
                recipes.listRecipes();
                System.out.println();
            }
            if(command.equals("find name")){
                System.out.println("Searched word: ");
                String searchedWord = scan.nextLine();
                System.out.println();
                
                recipes.findName(searchedWord);
            }
            if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scan.nextLine());
                System.out.println();
                
                recipes.findCookingTime(time);
            }
            if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingredient = scan.nextLine();
                System.out.println();
                
                recipes.findIngredient(ingredient);
            }
        }
    }
}
