import java.util.*;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shtyp nje fjalë");

        String fjala = sc.next();

        while (!(fjala.equals("end"))) {
            System.out.println("Fjala end e terminon unazen");
            fjala = sc.next();
        }
        System.out.println("Fjala e fundit qe ju shtypet eshte " + fjala);

    }
}
