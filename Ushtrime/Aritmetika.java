public class Aritmetika {
  public static void main(String[] args) {
    
	int x = 9;
	int y = 2;
	
	int z1 = x + y;
	int z2 = x - y;
	int z3 = x * y;
	int z4 = x / y;
	int z5 = x % y;
	
	int b1 = y + x;
	int b2 = y - x;
	int b3 = y * x;
	int b4 = y / x;
	int b5 = y % x;
	
	
	System.out.println(x + " + " + y + " = " + z1);
	System.out.println(x + " - " + y + " = " + z2);
	System.out.println(x + " * " + y + " = " + z3);
	System.out.println(x + " / " + y + " = " + z4);
	System.out.println(x + " % " + y + " = " + z5);
	
	System.out.println(y + " + " + x + " = " + b1);
	System.out.println(y + " - " + x + " = " + b2);
	System.out.println(y + " * " + x + " = " + b3);
	System.out.println(y + " / " + x + " = " + b4);
	System.out.println(y + " % " + x + " = " + b5);
	
  }
}