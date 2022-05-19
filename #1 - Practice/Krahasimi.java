import java.util.*;

public class Krahasimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheno numrin e pare:");
        double x = scanner.nextDouble();
        System.out.print("Sheno numrin e dyte:");
        double y = scanner.nextDouble();

        if (x > y) {
            System.out.println("Numri i pare eshte me i madh se numri i dyte");
            System.out.println(x + " > " + y);
        } else if (x < y) {
            System.out.println("Numri i dyte eshte me i madh se numri i pare");
            System.out.println(x + " < " + y);
        } else if (x == y) {
            System.out.println("Numri i pare eshte i barabarte me numrin e dyte");
            System.out.println(x + " = " + y);
        }

        else {
            System.out.println("Nuk egziston kjo vlere");
        }

    }
}
