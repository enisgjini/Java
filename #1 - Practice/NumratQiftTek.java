import java.util.*;

public class NumratQiftTek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheno numrin a:");
        short a = scanner.nextShort();
        if (a % 2 == 0) {
            System.out.println("a është çift");
        } else if (a % 2 != 0) {
            System.out.println("a është tek");

        } else if (a == 0) {
            System.out.println("a është zero");
        } else {
            System.out.println("Vlera nuk egziston");

        }

    }

}
