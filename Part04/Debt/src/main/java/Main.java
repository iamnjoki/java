
public class Main {

    public static void main(String[] args) {
        // Test your Debt class here
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        //debt accumulated in a period of 20 years
        while (years < 20) {
            mortgage.waitOneYear();
            years++;
        }

        mortgage.printBalance();
    }
}
