
import java.util.Scanner;

public class DogAttributes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Follow the instructions carefully
        // and run the tests.
        
        Dog myDog = new Dog("Doggie", "Yorkshire", 1);
        
        String dog = myDog.toString();
        System.out.println(dog);
        
        String barking = myDog.dogBarks();
        System.out.println(barking);
    }
}
