import java.util.*;

public class Zbritja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sheno numrin e pare: ");
        short nr1 = sc.nextShort();
        System.out.print("Sheno numrin e dyte: ");
        short nr2 = sc.nextShort();
        System.out.print(nr1 + " - " + nr2 + " = " + (nr1 - nr2));
    }
}
