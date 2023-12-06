
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money oldMoney = new Money(10, 00);
        Money newMoney = new Money(3, 50);
        
        boolean oldMoneyLessThanNewMoney = oldMoney.lessThan(newMoney);
        System.out.println(oldMoneyLessThanNewMoney);
    }
}
