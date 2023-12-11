
public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double cost = 2.50;
        double change = payment - cost;
        
        if(payment < cost) return payment;
        else{
            this.money += cost;
            this.affordableMeals++;
            return change;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double cost = 4.30;
        double change = payment - cost;
        
        if(payment < cost) return payment;
        else{
            this.money += cost;
            this.heartyMeals++;
            return change;
        }
    }

    public boolean eatAffordably(PaymentCard card){
        double cost = 2.50;
        if(card.balance() >= cost){
            card.takeMoney(cost);
            this.affordableMeals++;
            return true;
        }
        return false;
    }
    
    public boolean eatHeartily(PaymentCard card){
        double cost = 4.30;
        if(card.balance() >= cost){
            card.takeMoney(cost);
            this.heartyMeals++;
            return true;
        }
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum > 0){
            card.addMoney(sum);
            this.money += sum;
        }
        
    }

    @Override
    public String toString() {
        return "Money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
