import java.util.*;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheno notën: ");
        int rezultati = scanner.nextInt();

        if (rezultati == 60) {
            System.out.println("Nota 2");
        } else if (rezultati == 70) {
            System.out.println("Nota 3");
        } else if (rezultati == 80) {
            System.out.println("Nota 4 ");
        } else if (rezultati >= 90) {
            System.out.println("Nota 5");
        } else if (rezultati < 50) {
            System.out.println("Nxenesi nuk ka kaluar testin");
        }

        else {
            System.out.println("Nuk egziston kjo vlere");
        }
    }
}
