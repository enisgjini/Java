import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheno nje numer te plote:");
        double numriIMarrur = scanner.nextDouble();
        System.out.println("Numri qe ju shtypet eshte: " + numriIMarrur);
    }
}
