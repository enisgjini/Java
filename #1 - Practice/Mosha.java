import java.util.*;

public class Mosha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheno moshen:");
        int mosha = scanner.nextInt();

        if (mosha >= 18) {
            System.out.println("Ju keni drejte vote");
        } else {
            System.out.println("Ju nuk keni drejt vote");
        }

    }
}
