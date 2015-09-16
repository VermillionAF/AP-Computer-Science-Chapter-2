import java.util.Scanner;
public class CalcVf {

	public static void main(String[] args) {
		double vf_squared, vf;
		final double gravity = -9.8;
		Scanner scan = new Scanner(System.in);
		System.out.print("y (height) = ");
		 double height = scan.nextDouble();
		System.out.print("Vi(initial velocity) = ");
		 double vi = scan.nextDouble();
		 
		 vf_squared = Math.pow(vi, 2) + (2 * gravity * height);
		
		 vf = Math.sqrt(Math.abs(vf_squared));
		if (vf_squared < 0) {
			vf = -vf;
		}// end of if vf_squared is negative
		 
		 System.out.print("Final velocity is ");
		 System.out.printf("%.3f", vf);
		
	}// end of main
}// end of class
