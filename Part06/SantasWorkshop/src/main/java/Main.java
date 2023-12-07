
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift accessory = new Gift("Celine Bag", 1);
        Gift book = new Gift("Be a better coder", 3);
        
        Package packageOne = new Package();
        
        packageOne.addGift(accessory);
        packageOne.addGift(book);
        
        System.out.println("Gift: " + accessory.toString());
        System.out.println();
        packageOne.allGifts();
        
        System.out.println();
        int totalWeight = packageOne.totalWeight();
        System.out.println("Total gifts weight: " + totalWeight);
    }
}
