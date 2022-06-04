public class Nota {
    public static void main(String[] args) {
        int rezultati = 92;

        if (rezultati == 60)
        {
            System.out.println("Nota 2");
        }
        else if (rezultati == 70)
        {
            System.out.println("Nota 3");
        }
        else if (rezultati == 80)
        {
            System.out.println("Nota 4");
        }
        else if (rezultati >= 90)
        {
            System.out.println("Nota 5");
        }
        else if (rezultati < 50)
        {
            System.out.println("Nxenesi nuk e ka kaluar testin");
        }
    }
}
