
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        Statistics sumStatistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();
        
        System.out.println("Enter numbers: ");
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == -1)
                break;
            
            sumStatistics.addNumber(num);
            
            if(num % 2 == 0)
                evenStatistics.addNumber(num);
            if(num % 2 != 0)
                oddStatistics.addNumber(num);
        
        }
        
        int count = sumStatistics.getCount();
        System.out.println("Count: " + count);
        
        double average = sumStatistics.average();
        System.out.println("Average: " + average);
        
        int total = sumStatistics.sum();
        System.out.println("Sum: " + total);
        
        int even = evenStatistics.sum();
        System.out.println("Sum of even numbers: " + even);
        
        int odd = oddStatistics.sum();
        System.out.println("Sum of odd numbers: " + odd);
        
    }
}
