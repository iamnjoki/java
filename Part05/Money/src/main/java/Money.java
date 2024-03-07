
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        Money money = new Money(this.euros, this.cents);
        
        int eEuros = money.euros + addition.euros;
        int cCents = money.cents + addition.cents;
        
        Money newMoney = new Money(eEuros, cCents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros < compared.euros()) return true;
        if(this.euros == compared.euros && this.cents < compared.cents)return true;
        
        return false;
     }
    
    public Money minus(Money decreaser){
       Money money = new Money(this.euros, this.cents);
       
       int newEuroVal = money.euros - decreaser.euros();
       int newCentVal = money.cents - decreaser.cents();
       int totalCents = newEuroVal*100 + newCentVal;
        
       if(totalCents <= 0) money = new Money(0, 0);
       else{
           int eEuro = totalCents / 100;
           int cCents = totalCents % 100;
           money = new Money(eEuro, cCents);
       }
        return money;
    }

}
