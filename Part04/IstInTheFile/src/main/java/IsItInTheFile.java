
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> names = new ArrayList<>();
        boolean hasLines = false;
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                hasLines = true;
                String name = scan.nextLine();
                names.add(name);
            }
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed");
        }
        
        
        if(hasLines){
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            boolean found = false;

            if(names.contains(searchedFor))
                found = true;


            if(found) System.out.println("Found!");
            else System.out.println("Not found.");
        }
        
      
    }
}
