import java.util.*;

public class StringStartsWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sheno fjalin");
        String ubt = sc.nextLine();
        if (ubt.startsWith("ubt ")) {
            System.out.println("Fjala qe ju shtypet fillon me fjalen ubt");
        } else {
            System.out.println("Fjala qe ju shtypet nuk fillon me fjalen ubt");
        }
    }
}
