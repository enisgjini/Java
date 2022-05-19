import java.util.*;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheno temperaturën në Celsius: ");
        float temperaturaC = scanner.nextFloat();
        float temperaturaF = temperaturaC * 9 / 5 + 32;

        if (temperaturaF < 0 - 50) {

            System.out.println("Vlera e dhene eshte shume e ulët " + temperaturaF + " Fahrenheit");

        } else if (temperaturaF > 50) {

            System.out.println("Vlera e dhene eshte shume e lartë " + temperaturaF + " Fahrenheit");
        } else {
            System.out.println("Vlera e gabueshme");
        }
    }
}
