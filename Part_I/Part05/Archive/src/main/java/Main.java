
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Info> info = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier?(empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()) break;
            
            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()) break;
            
            Info details  = new Info(identifier, name);
            
            if(!info.contains(details))
                info.add(details);
        }
        
        System.out.println("==Items==");
        
        info.forEach(i -> {
            System.out.println(i);
        });
    }
}
