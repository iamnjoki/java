import java.nio.file.Paths;
import java.util.ArrayList;
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
public class Recipes {
    private ArrayList<Recipe> recipes;
    private ArrayList<String> ingredients;
    
    public Recipes(){
        this.recipes = new ArrayList<>();
        this.ingredients = new ArrayList<>();
    }
    
    public void readRecipes(String file){
        try(Scanner scan = new Scanner(Paths.get(file))){
           while(scan.hasNextLine()){
               String recipeName = scan.nextLine();
               int cookingTime = Integer.valueOf(scan.nextLine());
               Recipe recipe = new Recipe(recipeName, cookingTime);
               
               recipes.add(recipe);
               
               while(scan.hasNextLine()){
                   String ingredient = scan.nextLine();
                   
                   if(ingredient.isEmpty()) break;
                   
                   recipe.addIngredients(ingredient);
                }
            }
        }catch(Exception e){
           System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void listRecipes(){
        System.out.println("Recipes: ");
        
        recipes.forEach(recipe -> {
            System.out.println(recipe);
        });
    }
    
    
    public void findName(String nameToSearch){
        System.out.println("Recipes:");
        
        this.recipes.stream()
                .filter(recipe -> (recipe.getRecipeName()
                .contains(nameToSearch)))
                .forEachOrdered(recipe -> {
            System.out.println(recipe);
        });
    }
    
    public void findCookingTime(int time){
        System.out.println("Recipes:");
        
        for(Recipe r : this.recipes){
            if(r.getCookingTime() <= time){
                System.out.println(r);
            }
        }
    }
    
    public void findIngredient(String ing){
        System.out.println("Recipes:");
        
        for(int i = 0; i < this.recipes.size(); i++){
            if(this.recipes.get(i).getIngredients().contains(ing)){
                System.out.println(this.recipes.get(i));
            }
        }
    }
}
