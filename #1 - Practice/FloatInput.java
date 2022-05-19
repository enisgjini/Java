import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheno nje numer te plote:");
        float numriIMarrur = scanner.nextLong();
        System.out.println("Numri qe ju shtypet eshte: " + numriIMarrur);
    }
}
