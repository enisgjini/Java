import java.util.*;

public class OnlineVisa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Emri: ");
        String emri = sc.next();
        System.out.print("Mbiemri: ");
        String mbiemri = sc.next();
        System.out.print("Vendlindja: ");
        String vendlindja = sc.next();
        System.out.print("Kombesia: ");
        String kombesia = sc.next();
        System.out.print("I Punësuar: ");
        boolean pozitaPun = sc.nextBoolean();
        System.out.print("Mosha: ");
        int mosha = sc.nextInt();

        System.out.println("------------------------------------------------");
        System.out.println("Aplikimi juaj eshte pranuar me sukses");
        System.out.println("Emri: " + emri);
        System.out.println("Mbiemri: " + mbiemri);
        System.out.println("Vendlindja: " + vendlindja);
        System.out.println("Kombesia: " + kombesia);
        System.out.println("I Punësuar: " + pozitaPun);
        System.out.println("Mosha: " + mosha);

    }
}
