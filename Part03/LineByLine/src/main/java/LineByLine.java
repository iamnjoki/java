
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence or string. Empty input stops the programm.");
        String str = scanner.nextLine();
        
        String[] arr = str.split(" ");
        
        for(String s : arr)
            System.out.println(s);
    }
}
