

public class Main {

    public static void main(String[] args) {

        // Try out your class here
        SimpleCollection characters = new SimpleCollection("characters");
        System.out.println(characters);        
        
        System.out.println();
        
        characters.add("magneto");
        System.out.println(characters);
        
        System.out.println();
        
        characters.add("mystique");
        System.out.println(characters);
        
        System.out.println();
        
        characters.add("phoenix");
        System.out.println(characters);
        
        
        System.out.println("Elems: " + characters.getElements());
    }
}
