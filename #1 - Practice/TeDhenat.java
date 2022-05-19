
import java.util.*;

public class TeDhenat {
    public static void main(String[] args) {
        // Clasess
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        int x = ran.nextInt(6) + 5;

        System.out.println("ID juaj e gjeneruar " + x);
        // int id = scanner.nextInt();
        // int id = Math.random();
        System.out.println("Sheno emrin: ");
        String emrin = scanner.next();
        System.out.println("Sheno mbiemrin: ");
        String mbiemrin = scanner.next();
        System.out.println("Sheno vitin e lindjes: ");
        short vitiLindjes = scanner.nextShort();
        System.out.println("Sheno vitin e studimit: ");
        byte vitiIStudimit = scanner.nextByte();

        System.out.println("-----------------------------------");

        System.out.println("Ju ofruat këto të dhena personale: ");
        // System.out.println("ID: " + x);
        System.out.println("Emri: " + emrin);
        System.out.println("Mbiemri: " + mbiemrin);
        System.out.println("Viti i lindjes: " + vitiLindjes);
        System.out.println("Viti i studimit: " + vitiIStudimit);

    }
}
