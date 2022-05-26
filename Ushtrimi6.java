import java.util.*;

public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shtyp numer | Numri -9999 e terminon unazen");

        int numri = sc.nextInt();
        int count = 0;

        while (numri != -9999) {
            System.out.println("Shtyp numer | Numri -9999 e terminon unazen");

            numri = sc.nextInt();
            if (numri > 5) {
                count++;
            }

            // System.out.println(numri);
            // break;

            // // System.out.println("Numri ");
            // // numri = sc.nextInt();
        }
        System.out.println("Ju keni shtypur " + count + " numra me te medhenje se 5");

    }
}