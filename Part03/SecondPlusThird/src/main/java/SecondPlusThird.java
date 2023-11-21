
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            numbers.add(number);
        }
<<<<<<< HEAD
        
=======

>>>>>>> 2d82187e6a9061aca5708906dbe899d76b477a29
        int secondVal = numbers.get(1);
        int thirdVal = numbers.get(2);
        
        System.out.println(secondVal + thirdVal);
    }
}
