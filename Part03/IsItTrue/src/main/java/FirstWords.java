
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        
        System.out.println(arr[0]);

    }
}
