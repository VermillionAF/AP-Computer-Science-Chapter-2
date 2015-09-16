import java.util.Scanner;

public class RDecay {
	
	public static void main(String[] args) {
		double t, N0, decay, e_decay;
		final double e = 2.7183;
		Scanner scan = new Scanner(System.in);
		System.out.println("How much Carbon-14 was their initially?");
		N0 = scan.nextDouble();
		System.out.println("How long has it been there (years)?");
		t = scan.nextDouble();
		
		decay = N0 * Math.pow(e, (-0.693 * t) / 5730);
		e_decay = N0 * Math.exp((-0.693 * t) / 5730);
		
		System.out.print("Remaining Carbon-14: ");
		System.out.printf("%.3f", decay);
		System.out.print("\nWhen using e instead of 2.27183: ");
		System.out.printf("%.3f", e_decay);
		
	} //end of main

}// end of class
