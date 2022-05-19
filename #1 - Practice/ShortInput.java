import java.util.Scanner;
public class ShortInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Sheno nje numer te plote:");
        short numriIMarrur = scanner.nextShort();
        System.out.println("Numri qe ju shtypet eshte: " + numriIMarrur );
    }
}
