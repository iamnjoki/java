
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input  = scanner.nextLine();
            
            if(!input.equals("end")){
               int i = 0;
               int cube = 1;
               
               while(i < 3){
                   cube *= Integer.valueOf(input);
                   i++;
                }
                System.out.println(cube);
            }else break;
            
        }
            
    }
}
