import java.util.*;

public class DitetEMuajit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sheno muajin:");
        String muaji = scanner.next();

        if (muaji == "Janar") {
            System.out.println("Janar - 31 Dite ");
        } else if (muaji == "Shkurt") {
            System.out.println("Shkurt - 28 Dite");
        } else if (muaji == "Mars") {
            System.out.println("Mars - 31 Dite");
        } else if (muaji == "Prill") {
            System.out.println("Prill - 30 dite");
        } else if (muaji == "Maj") {
            System.out.println("Maj - 31 dite");
        } else if (muaji == "Qershor") {
            System.out.println("Qershor - 30 dite");
        } else if (muaji == "Korrik") {
            System.out.println("Korrik - 31 dite");
        } else if (muaji == "Gusht") {
            System.out.println("Gusht - 30 dite");
        } else if (muaji == "Shtator") {
            System.out.println("Shtator - 31 dite");
        } else if (muaji == "Tetor") {
            System.out.println("Tetor - 30 dite");
        } else if (muaji == "Nentor") {
            System.out.println("Nentor - 31 dite");
        } else if (muaji == "Dhjetor") {
            System.out.println("Dhjetor - 30 dite");
        }

        else {
            System.out.println("Nuk egziston kjo vlere");
        }
    }
}
