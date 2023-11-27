
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Follow the instructions carefully 
        // and run the tests.
        
        Room myRoom = new Room("Red", 4);
        String room = myRoom.toString();
        System.out.println(room);
        
        Room anotherRoom = new Room();
        System.out.println(anotherRoom.toString());
    }

}
