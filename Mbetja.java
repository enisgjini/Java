import java.util.*;

public class Mbetja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sheno numrin e pare: ");
        double nr1 = sc.nextDouble();
        System.out.print("Sheno numrin e dyte: ");
        double nr2 = sc.nextDouble();
        System.out.print(nr1 + " % " + nr2 + " = " + (nr1 % nr2));
    }
}
