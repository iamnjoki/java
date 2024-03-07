
public class Main {

    public static void main(String[] args) {
        // you can write code here for testing your program

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song newSong = new Song("A song was sung", "Him", 102);

        if (jackSparrow.equals(anotherSparrow)) 
                System.out.println("Songs are equal.");
        else System.out.println("Not equal");
    }
}
