
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");
        
        printValuesOfKeysWhere(hashmap, ".e");
        System.out.println();
        printKeysWhere(hashmap, ".e");
        System.out.println();
        printKeys(hashmap);
    }
    
    public static void printKeys(HashMap<String, String> hashmap){
            for(String k : hashmap.keySet()){
                System.out.println(k);
            }
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text){
        for(String k : hashmap.keySet()){
            if(k.contains(text))
                System.out.println(k);
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text){
        for(String k : hashmap.keySet()){
            if(k.contains(text))
                System.out.println(hashmap.get(k));
        }
    
    }

}
