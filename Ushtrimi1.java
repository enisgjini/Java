import java.util.*;

public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sheno nje numer se paku 5");
        int nr = sc.nextInt();

        while (nr < 5) {
            System.out.println("Sheno nje numer se paku 5");
            nr = sc.nextInt();
        }
        System.out.println("Numri qe ju shtypet eshte: " + nr);
    }

}
