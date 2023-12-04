
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);
        System.out.println();
        
        PaymentCard paulinesCard = new PaymentCard(2);
        System.out.println("Amount of money on the card is " + paulinesCard.balance() + " euros");
        System.out.println();

        System.out.println("Buy a hearty meal.");
        boolean wasSuccessful = unicafeExactum.eatHeartily(paulinesCard);
        
        System.out.println("There was enough money: " + wasSuccessful);
        System.out.println();

        System.out.println("Add money to card...");
        unicafeExactum.addMoneyToCard(paulinesCard, 100);
        System.out.println("New total on the card = " + paulinesCard.balance());

        System.out.println("Buy a hearty meal.");
        wasSuccessful = unicafeExactum.eatHeartily(paulinesCard);
        System.out.println("There was enough money: " + wasSuccessful);
        System.out.println();

        System.out.println("The mount of money on the card is " + paulinesCard.balance() + " euros");
        System.out.println();
        
        System.out.println(unicafeExactum);
    }
}

