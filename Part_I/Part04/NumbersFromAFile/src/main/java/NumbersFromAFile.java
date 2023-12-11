
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File? ");
        String file = scanner.nextLine();
        
        System.out.println();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        System.out.println();
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        System.out.println();
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine())
                numbers.add(Integer.valueOf(scan.nextLine()));
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        int count = 0;
        for(int num : numbers){
            if(num >= lowerBound && num <= upperBound){
                System.out.println(num);
                count++;
            }
        }
        
        System.out.println();
        System.out.println("Numbers: " + count);
    }

}
