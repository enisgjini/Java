import java.util.*;

public class NumratPozNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheno numrin a:");
        byte a = scanner.nextByte();
        if (a > 0) {
            System.out.println("a është pozitiv");
        } else if (a < 0) {
            System.out.println("a është negativ");
        } else if (a == 0) {
            System.out.println("a është zero");
        } else {
            System.out.println("Vlera nuk egziston");
        }
    }
}
