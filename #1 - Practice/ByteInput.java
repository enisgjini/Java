import java.util.Scanner;

public class ByteInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Sheno nje numer te plote:");
        byte numriIMarrur = scanner.nextByte();
        System.out.println("Numri qe ju shtypet eshte: " + numriIMarrur );
    }
}