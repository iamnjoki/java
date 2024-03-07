
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
       
        /*dictionary.add("habari", "Wie geht's");
        dictionary.add("ndio", "ja");
        
        String translation = dictionary.translate("habari");
        System.out.println("Translation for \"habari\" is: " + translation);
        
        System.out.println("Translation for the word \"ndio\" is: " + dictionary.translate("ndio")); */
        
        TextUI ui = new TextUI(scanner, dictionary); 
        ui.start();
        
        
    }
}
