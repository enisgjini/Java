import java.util.*;

public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sheno nje numer se paku 10");
        int nr = sc.nextInt();

        while (nr < 10) {
            System.out.println("Sheno nje numer se paku 10");
            nr = sc.nextInt();
        }
        System.out.println("Numri qe ju shtypet eshte: " + nr);
    }
}
