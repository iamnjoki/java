
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("Code", new Book("Code", 2011, "..."));
        hashmap.put("Java", new Book("Java", 2006, "..."));
        
        printValues(hashmap);
        printValueIfNameContains(hashmap, "co");
    }
    
    public static void printValues(HashMap<String, Book> hashmap){
       for(Book b : hashmap.values()){
           System.out.println(b);
        } 
    }
     
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text){
         
         for(Book b : hashmap.values()){
            if(b.getName().contains(text))
                System.out.println(b);
        }
    }
}