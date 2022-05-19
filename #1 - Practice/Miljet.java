import java.util.*;

public class Miljet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheno kilometrat: ");
        long km = scanner.nextLong();
        double milje = km * 0.62137;

        if (km < 1) {
            System.out.println("Distanca e dhene eshte gabim");
        } else {
            System.out.println("Distanca në milje: " + milje);
        }

    }
}
