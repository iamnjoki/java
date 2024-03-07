
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person leo = new Person("Leo", hulda);
        System.out.println(leo);
        
        Person p = new Person("Pey");
        System.out.println(p);
        
        Person person = new Person();
        System.out.println(person);
    }
}
