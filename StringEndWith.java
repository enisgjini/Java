import java.util.*;

public class StringEndWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sheno fjalin");
        String ubt = sc.nextLine();
        if (ubt.endsWith("ubt")) {
            System.out.println("Fjala qe ju shtypet mbaron me fjalen ubt");
        } else {
            System.out.println("Fjala qe ju shtypet nuk mbaron me fjalen ubt");
        }
    }
}
