import java.util.Scanner;
public class Polynomials {
	public static void main(String[] args) {
		double a,b,c,d,e,x;
		double xa,xb,xc,xd,answer;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ax^4 + bx^3 + cx^2 + dx + e");
		System.out.print("a = ");
			a = scan.nextDouble();
		System.out.print("\nb = ");
			b = scan.nextDouble();
		System.out.print("\nc = ");
			c = scan.nextDouble();
		System.out.print("\nd = ");
			d = scan.nextDouble();
		System.out.print("\ne = ");
			e = scan.nextDouble();
		System.out.print("\nGive a value for x: ");
			x = scan.nextDouble();
			
		xa = a * Math.pow(x, 4);
		xb = b * Math.pow(x, 3);
		xc = c * Math.pow(x, 2);
		xd = d * x;
		
		answer = xa + xb + xc + xd + e;
		
		System.out.println("The answer is " + answer);
	}// end of main

}// end of class
