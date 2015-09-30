//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;

public class Paint
{
    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        int length, width, height;//declare integers length, width, and height;
        double totalSqFt;//declare double totalSqFt;
        double paintNeeded;//declare double paintNeeded;
        Scanner scan = new Scanner(System.in);//declare and initialize Scanner object
        DecimalFormat format = new DecimalFormat("0.###");

        System.out.println("List the room's length.");
        length = scan.nextInt();//Prompt for and read in the length of the room
        
        System.out.println("List the room's width.");
        width = scan.nextInt();//Prompt for and read in the width of the room

        System.out.println("List the room's height.");
        height = scan.nextInt();//Prompt for and read in the height of the room
        
        System.out.println("How many doors?");
        int doors = scan.nextInt();
        
        System.out.println("How many windows?");
        int windows = scan.nextInt();

        totalSqFt = (2 * length * height) + (2 * width * height);//Compute the total square feet to be painted--think
        //about the dimensions of each wall

        paintNeeded = (totalSqFt / COVERAGE) - (20 * doors) - (15 * windows);//Compute the amount of paint needed

        System.out.println("The room's length is " + length + ", the width is " + width + ", and the height is " + height);
        System.out.println("The total amount of paint need is " + format.format(paintNeeded));//Print the length, width, and height of the room and the
        //number of gallons of paint needed.
    }
}
