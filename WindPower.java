import java.util.Scanner;
import java.text.DecimalFormat;
public class WindPower {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.###");
		double v, velocity, velocity2, velocity3, power, length, totpow, number;
		final double rho = 1.2754;
		final double ft2m = 0.3048;
		final double hr2s = 3600;
		final double mi2ft = 5280;
		
		System.out.print("What is the velocity of the wind? [MPH]");
			v = scan.nextDouble();
			
			velocity = v * mi2ft;
			velocity2 = velocity / hr2s;
			velocity3 = velocity2 * ft2m;
			
			power = 0.5 * rho * Math.pow(velocity3, 3);
		
		System.out.print("What is the blade length of the turbine? ");
			length = scan.nextDouble();
		System.out.print("How many turbines?");
			number = scan.nextDouble();
			
			totpow = number * (Math.PI * Math.pow(length, 2)) * power;
			
		System.out.print("You would generate " + fmt.format(totpow) + " watts of power.");

		
	}// end of main

}//end of class
