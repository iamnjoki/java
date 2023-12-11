
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared){
        int apt1 = this.squares * this.princePerSquare;
        int apt2 = compared.squares * compared.princePerSquare;
        int difference = 0; 
        
        if(apt1 > apt2) 
            difference = apt1 - apt2;
        if(apt2 > apt1)
            difference = apt2 - apt1;
        
        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return (this.squares * this.princePerSquare) > (compared.squares * compared.princePerSquare); 
    }

}
