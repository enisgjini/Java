public class IncrementTest {
  public static void main(String[] args) {
    
	byte nr1 = 10;
	short  nr2 = 11;
	int nr3 = 12;
	long nr4 =  13;
	
	System.out.println("Vlera e varibles perpara se te perdorim increment : nr1 = " + nr1);
	System.out.println("Vlera e varibles perpara se te perdorim increment : nr2 = " + nr2);
	System.out.println("Vlera e varibles perpara se te perdorim increment : nr3 = " + nr3);
	System.out.println("Vlera e varibles perpara se te perdorim increment : nr4 = " + nr4);
  
	nr1++;
	nr2++;
	nr3++;
	nr4++;
	
	System.out.println("Vlera e variables pas perdorim te increment : nr1 = " + nr1);
	System.out.println("Vlera e variables pas perdorim te increment : nr2 = " + nr2);
	System.out.println("Vlera e variables pas perdorim te increment : nr3 = " + nr3);
	System.out.println("Vlera e variables pas perdorim te increment : nr4 = " + nr4);
  
  }
}