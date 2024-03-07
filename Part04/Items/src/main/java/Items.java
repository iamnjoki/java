
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name: ");
        
        while(true){
            String item = scanner.nextLine();
           
            if(item.isEmpty()) break;
            
            items.add(new Item(item));
          }
        
        items.forEach(item -> {
            System.out.println(item);
        });

    }
}
