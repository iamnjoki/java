
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word(s):");
        
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        
        for(String word : arr){
            if(word.contains("av"))
                System.out.println(word);
        }
    }
}
