import java.util.*;

public class Kalendari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheno muajin:");
        short muajiIVitit = scanner.nextShort();

        if (muajiIVitit == 1) {
            System.out.println("Janar");
        } else if (muajiIVitit == 2) {
            System.out.println("Shkurt");
        } else if (muajiIVitit == 3) {
            System.out.println("Mars ");
        } else if (muajiIVitit == 4) {
            System.out.println("Prill");
        } else if (muajiIVitit == 5) {
            System.out.println("Maj");
        } else if (muajiIVitit == 6) {
            System.out.println("Qershor");
        } else if (muajiIVitit == 7) {
            System.out.println("Korrik");
        } else if (muajiIVitit == 8) {
            System.out.println("Gusht");
        } else if (muajiIVitit == 9) {
            System.out.println("Shtator");
        } else if (muajiIVitit == 10) {
            System.out.println("Tetor");
        } else if (muajiIVitit == 11) {
            System.out.println("Nentor");
        } else if (muajiIVitit == 12) {
            System.out.println("Dhjetor");
        }

        else {
            System.out.println("Nuk egziston kjo vlere");
        }

    }
}
