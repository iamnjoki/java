
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int positiveNums = 0;

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            if (num > 0) {
                positiveNums += num;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * positiveNums / count);
        }
    }
}
