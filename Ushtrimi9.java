import java.util.*;

public class Ushtrimi9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shtyp nje fjalë");

        String fjala = sc.next();

        int count = 0;

        while (!(fjala.equals("end"))) {
            System.out.println("Fjala end e terminon unazen");

            fjala = sc.next();
            
            if (fjala.contains("ubt")) {
                count++;
            }
            
        }
        System.out.println("Ju keni shtypur " + count + "  emra qe permbajne fjalen ubt");

    }
}