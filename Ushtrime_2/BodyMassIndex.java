public class BodyMassIndex {
    public static void main(String[] args) {
        int bmi = 28;

        if (bmi < 18) {
            System.out.println("Nen peshen e rekomanduar");
        } else if (bmi > 18 && bmi < 24) {
            System.out.println("Në peshen e rekomanduar");
        } else if (bmi > 25 && bmi < 29) {
            System.out.println("Mbi peshen e rekomanduar");

        }
        else if (bmi > 30)
        {
            System.out.println("Obes");
        }

    }
}
