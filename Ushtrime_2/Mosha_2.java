public class Mosha_2 {
    public static void main(String[] args) {
        int mosha = 25;

        if (mosha > 0 && mosha <= 5)
        {
            System.out.println("Moshë parashkollore");
        }
        else if ( mosha >= 6 && mosha <= 10 )
        {
            System.out.print("Moshë shkollore - Klasa 1 - 5 ");
        }
        else if ( mosha >= 10 && mosha <= 14 )
        {
            System.out.print("Moshë shkollore - Klasa 6 - 9 ");
        }
        else if ( mosha >= 14 && mosha <= 18 )
        {
            System.out.print("Klasa 10 - 12 ");
        }
        else if ( mosha > 18 )
        {
            System.out.print("Studime");
        }
        else
        {
            System.out.print("Mosha e dhënë gabim");
        }
    }
}
