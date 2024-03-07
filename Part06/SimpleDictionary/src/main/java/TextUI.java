/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pak
 */
import java.util.Scanner;

public class TextUI {
    private SimpleDictionary dictionary = new SimpleDictionary();
    private Scanner scanner = new Scanner(System.in);
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.dictionary = dictionary;
        this.scanner = scanner; 
    }
    
    public void start(){
        
        while(true){
            System.out.println("Command: ");
            String userInput = scanner.nextLine();
            
            if(userInput.equals("end")){
                break;
            }
            
            switch (userInput) {
                case "add":
                    System.out.println("Word: ");
                    String word = scanner.nextLine();
                    System.out.println("Translation");
                    String translation = scanner.nextLine();
                    this.dictionary.add(word, translation);
                    break;
                case "search":
                    System.out.println("To be translated: ");
                    String toSearch = scanner.nextLine();
                    String translated = this.dictionary.translate(toSearch);
                    if(translated == null)
                        System.out.println("Word " + toSearch + " was not found");
                    
                    else System.out.println("Translation: " + translated);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
            
        }
        
        System.out.println("Bye bye");
    }
}
