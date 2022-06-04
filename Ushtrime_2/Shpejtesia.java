public class Shpejtesia {
    public static void main(String[] args) {
        int shpejtesia = 90;

        if (shpejtesia == 0)
        {
            System.out.println("Vetura eshte e ndalur");
        }
        else if (shpejtesia == 30)
        {
            System.out.println("Shpejtesia " + shpejtesia + " km/h. Vetura eshte duke levizur ngadal");
        }
        else if (shpejtesia == 60)
        {
            System.out.println("Shpejtesia " + shpejtesia + " km/h. Vetura eshte duke levizur shpejtesi normale");
        }
        else if (shpejtesia == 90)
        {
            System.out.println("Shpejtesia " + shpejtesia + " km/h. Vetura eshte duke levizur mbi shpejtesine normale");
        }
        else if (shpejtesia == 120)
        {
            System.out.println("Shpejtesia " + shpejtesia + " km/h. Vetura eshte duke levizur shume shpejte ");
        }     
        else   
        {
            System.out.println("Shpejtesia ka vlere gabim");
        }
    }
}
