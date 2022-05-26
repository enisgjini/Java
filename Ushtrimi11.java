import java.util.*;

public class Ushtrimi11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shtyp nje fjalë");

        String fjala = sc.next();

        int count = 0;

        while (!(fjala.equals("end"))) {
            System.out.println("Fjala end e terminon unazen");

            fjala = sc.next();
            
            if (fjala.startsWith("ubt")) {
                count++;
            }
            
        }
        System.out.println("Ju keni shtypur " + count + "  emra qe fillojne me fjalen ubt");

    }
}