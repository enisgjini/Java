import java.util.*;

public class StringEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sheno fjalin");
        String drejtimi = sc.nextLine();
        if (drejtimi.equals("shkenca kompjuterike")) {
            System.out.println("Fjala qe ju shtypet eshte shkenca kompjuterike");
        } else {
            System.out.println("Fjala qe ju shtypet nuk eshte shkenca kompjuterike");
        }
    }
}
