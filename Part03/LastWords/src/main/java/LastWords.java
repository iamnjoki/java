
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        
        String lastWord = arr[arr.length - 1];
        System.out.println(lastWord);
    }
}
