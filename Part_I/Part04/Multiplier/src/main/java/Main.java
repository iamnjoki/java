
public class Main {

    public static void main(String[] args) {
        // Test your Multiplier class here

        Multiplier byThree = new Multiplier(3);
        
        int num = byThree.multiply(2);
        System.out.println(num);
        
        Multiplier byAMillion = new Multiplier(1000000);
        int product = byAMillion.multiply(10);
        System.out.println(product);
    }
}
