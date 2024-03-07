import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Title: ");
            String title = scan.nextLine();
            
            if(title.isEmpty()) break;
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scan.nextLine());
            
            books.add(new Book(title, pages, pubYear));
            
        }
        
        System.out.println("What info should be printed? ");
        String str = scan.nextLine();
        
        books.forEach(book -> {
            if(str.equals("everything".toLowerCase()))
                System.out.println(book);
            else if(str.equals("name".toLowerCase()))
                System.out.println(book.getTitle());
        });
        
     }

}
