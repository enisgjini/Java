

public class CilesiaEAjrit {
    public static void main(String[] args) {
        int ICA = 115;

        if (ICA <= 0) {
            System.out.print("Vlera e indeksit eshte dhene gabim");
        } else if (ICA > 0 && ICA < 49) {
            System.out.print("Indeksi i ulet. \n Mund te vazhdoni me aktivitetet tuaja te zakonshme ne natyre");
        } else if (ICA > 50 && ICA < 74) {
            System.out.print(
                    "Indeksi i moderuar. \n Reduktoni aktivitetet e jashtme nese jenu dyke perjetuar ndonje simptome.");
        } else if (ICA > 75 && ICA < 100) {
            System.out.print(
                    "Indeksi i lartë. \n Reduktoni aktivitetet e jashtme \n Femijet dhe gjithashtu te moshuarit duhet te kene kujdes");
        } else if (ICA > 100) {
            System.out.print(
                    "Indeksi shumë i lartë. \n Shmangini aktivitetet e jashtme \n Femijet dhe gjithashtu te moshuarit duhet te kene kujdes");



        }
    }
}
