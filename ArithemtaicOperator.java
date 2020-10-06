
public class ArithemtaicOperator {
	
	public static void main(String args[]) {
		/* Arithmetic
		 * Bitwise
		 * Relational
		 * Logical
		 */
		int a=15,b=2;
		int sum= a+b;
		int sub = a-b;
		int mult = a*b;
		double div=(double) a/b;
		int mod= a%b;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		System.out.println(mod);
		int m=10;
		int n=5;
		
		//post increment
		m=n++;  // first value is assigned to m and then n is incremented
		System.out.println(m);
		System.out.println(n);
		
		//pre increment
		m=++n; //first value is incremented and then assigned to m
		System.out.println(m);
		System.out.println(n);
				
	}

}
