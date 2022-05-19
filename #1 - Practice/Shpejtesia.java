import java.util.*;

public class Shpejtesia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheno numrin a:");
        int shpejtesia = scanner.nextInt();
        if (shpejtesia == 0) {
            System.out.println("Vetura eshte e ndalur");
        } else if (shpejtesia == 30) {
            System.out.println("Shpejtesia " + shpejtesia + " km/h.Vetura eshte duke levizur ngadal");
        } else if (shpejtesia == 60) {
            System.out.println("Shpejtesia " + shpejtesia + " km/h.Vetura eshte duke levizur me shpejtesi normale");
        } else if (shpejtesia == 90) {
            System.out.println("Shpejtesia " + shpejtesia + " km/h.Vetura eshte duke levizur mbi shpejtesine normale");
        } else if (shpejtesia == 120) {
            System.out.println("Shpejtesia " + shpejtesia + " km/h.Vetura eshte duke levizur shume shpejte");
        } else {
            System.out.println("Shpejtesi e gabueshme");
        }
    }
}
