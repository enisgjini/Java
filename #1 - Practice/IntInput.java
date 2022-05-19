import java.util.Scanner;
public class IntInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Sheno nje numer te plote:");
        int numriIMarrur = scanner.nextInt();
        System.out.println("Numri qe ju shtypet eshte: " + numriIMarrur );
    }
}
