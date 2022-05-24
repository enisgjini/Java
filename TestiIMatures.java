import java.util.*;

public class TestiIMatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Emri: ");
        String emri = sc.nextLine();
        System.out.print("Mbiemri: ");
        String mbiemri = sc.nextLine();
        System.out.print("Emri i shkolles: ");
        String emriIShkolles = sc.nextLine();
        System.out.print("Numri i pikeve ne test: ");
        int piket = sc.nextInt();
        System.out.println("----------------------------");
        if (piket > 80) {
            System.out.println(emri + " " + mbiemri + " " + emriIShkolles);
            System.out.println("Urime! Ju keni kaluar me sukses testin e matures");
        } else if (piket < 80) {
            System.out.println(emri + " " + mbiemri + " " + emriIShkolles);
            System.out.print("Ju nuk e keni kaluar testin e matures");
        } else {
            System.out.print("Vlera e dhene gabim");
        }
    }
}
