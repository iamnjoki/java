
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
        
        System.out.println("Price difference is: " + manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
        System.out.println("Price difference is: " + bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400
        System.out.println();
        
        System.out.println("Is Manhattan studio Apt larger than Atlanta two bedroom Apt?");
        System.out.println(manhattanStudioApt.largerThan(manhattanStudioApt));
        System.out.println();
        
        System.out.println("Is Atlanta two bedroom Apt more expensive than Manhattan studio Apt?");
        System.out.println(atlantaTwoBedroomApt.moreExpensiveThan(manhattanStudioApt));
    }
}
