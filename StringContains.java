import java.util.*;

public class StringContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sheno fjalin");
        String drejtimi = sc.nextLine();
        if (drejtimi.contains("shkenca ")) {
            System.out.println("Fjala qe ju shtypet permban fjalen shkenca");
        } else {
            System.out.println("Fjala qe ju shtypet nuk permban fjalen shkenca");
        }
    }
}
