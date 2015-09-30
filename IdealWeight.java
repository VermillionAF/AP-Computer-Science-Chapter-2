import java.util.Scanner;
public class IdealWeight {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int height, heightFeet, heightInches, idealMale, idealFemale;
	double maleRangeUp, femaleRangeUp, maleRangeDown, femaleRangeDown;
	System.out.println("What is your height? Type feet then inches, seperated by a space");
	heightFeet = scan.nextInt();
	heightInches = scan.nextInt();
	height = (12 * heightFeet) + heightInches;
	
	idealMale = 100 + (6 * (height - 60));
	idealFemale = 100 + (5 * (height - 60));
	
	System.out.println("The ideal for a female of that height is " + idealFemale + " pounds, while a male is " + idealMale + " pounds.");
	
	maleRangeUp = idealMale + (idealMale * 0.15);
	maleRangeDown = idealMale - (idealMale * 0.15);
	femaleRangeUp = idealFemale + (idealFemale * 0.15);
	femaleRangeDown = idealFemale - (idealFemale * 0.15);
	
	System.out.println("An acceptable range for a male would be " + maleRangeDown + " to " + maleRangeUp + " pounds.");
	System.out.println("An acceptable range for a female would be " + femaleRangeDown + " to " + femaleRangeUp + " pounds.");
	} // end of main
} // end of class
