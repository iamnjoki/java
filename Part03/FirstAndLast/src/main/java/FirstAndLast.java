
import java.util.ArrayList;
import java.util.Scanner;

<<<<<<< HEAD
public class FirstAndLast {
=======
public class FirstAndLast {
>>>>>>> 2d82187e6a9061aca5708906dbe899d76b477a29

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        String first = list.get(0);
        String last = list.get(list.size() - 1);
        System.out.println("First item: " + first +"\nLast item: " + last);
    }
}
