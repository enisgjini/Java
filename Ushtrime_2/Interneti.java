public class Interneti {
    public static void main(String[] args) {
        int indeksi = 3;

        if (indeksi == 0) {
            System.out.println("Abonues i ri - Nuk aplikohet zbritja");
        } else if (indeksi == 1 || indeksi == 2) {
            System.out.println("Aplikohet 15% zbritje");

        } else if (indeksi == 3 || indeksi == 4) {
            System.out.println("Aplikohet 25% zbritje");

        } else if (indeksi > 4) {
            System.out.println("Aplikohet 35% zbritje");

        }
        else
        {
            System.out.println("Vlera e dhene gabim");
        }

    }
}
