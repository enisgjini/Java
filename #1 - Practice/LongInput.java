import java.util.Scanner;

public class LongInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Sheno nje numer te plote:");
        long numriIMarrur = scanner.nextLong();
        System.out.println("Numri qe ju shtypet eshte: " + numriIMarrur );
    }
}
