
public class Main {

    public static void main(String[] args) {


        // Try out your class here
        SimpleCollection collection = new SimpleCollection("characters");
        System.out.println("Longest: " + collection.longest());
        
        collection.add("magneto");
        collection.add("mystique");
        collection.add("phoenix");
        
        System.out.println("Longest: " + collection.longest());

        
    }
}
