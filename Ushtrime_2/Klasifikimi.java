public class Klasifikimi {
    public static void main(String[] args) {
        int numriEkipit = 5;

        if (numriEkipit <= 0) {
            System.out.println("Vlera e pozites eshte dhene gabim");
        } else if (numriEkipit >= 2 && numriEkipit <= 4) {
            System.out.println("Ekipi eshte kualifikuar per ne Uefa Champions League");
        } else if (numriEkipit >= 5 && numriEkipit <= 7) {
            System.out.println("Ekipi eshte kualifikuar per ne Uefa Europa League");
        }
        else if (numriEkipit >= 8 && numriEkipit <= 17) {
            System.out.println("Ekipi ka siguruar mbijetesen");
        }
        else if (numriEkipit >= 18 && numriEkipit <= 20) {
            System.out.println("Ekipi ka rene nga liga");
        }
        else {
            System.out.println("Ekipi eshte shpallur kampion");
        }
    }
}
