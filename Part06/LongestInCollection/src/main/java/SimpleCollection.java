
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
       
    public String longest(){
        if(this.elements.isEmpty()) return null;
        
        int longest = this.elements.get(0).length();
        String longestString = "";
        
        for(String str : this.elements){
            int stringLen = str.length();
            if(stringLen > longest){
                longest = stringLen;
                longestString += str;
            }
         }
        
        return longestString;
    }
}
