
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account myAccount = new Account("Pauline", 20000);
        myAccount.withdrawal(10000);
        
        System.out.println(myAccount);
    }
}
