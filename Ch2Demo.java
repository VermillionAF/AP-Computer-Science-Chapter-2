/************************************************
 *  File:		Ch2Demo
 *  Author:		J.Foy
 *  Created:	7/14/2015
 *  Demos several Chapter 2 concepts
 *  Revision History
 *  	Rev 0:	Initial Release
 *  
 */

//  Explorations:
//  Number 1:  Change values of variables c1 - c8, determine if
//  calculated (and displayed) gpa is correct
//
//  Number 2: Change names of courses to your classes.  Edit output
//  lines so that the columns are vertically aligned
//
//  Number 3: Remove the parenthesis from around (Math.random() * 100)
//  and rerun the program 2 or 3 times
//
//  Number 4: (ADVANCED) Referring to bottom of page 88, change the
//  random number generator so it gives you a grade more to your 
//  expectations

import java.util.*;
import java.util.Scanner;

public class Ch2Demo 
{
	
	public static void main(String[] args) 
	{
	// variables local to this method
	int c1,c2,c3,c4,c5,c6,c7,c8;
	int age;
	int gpa;
	int APCSgrade;
	double gpad;
	String myname;
	
	// Scanner class: see pages 89 - 91
	 Scanner invalue = new Scanner(System.in);
	 System.out.print("Enter your first name:\t");
	 myname = invalue.nextLine();
	 
	 System.out.print("Enter your age as an integer:\t");
	 age = invalue.nextInt();
	 
	 // Escape sequences see page 60
	 System.out.println("My first name is\t" + myname);
	 System.out.println("My age is\t " + age);
	 System.out.println("In days, my age is " + (age * 365) + " days\n");
	 
	 c1 = 90;
	 c2 = c3 = 92;
	 c4 = c5 = 93;
	 c6 = 95;
	 c7 = 83;
	 c8 = 80;
	 
	 System.out.println("Course \t Grade");
	 System.out.println("___________________");
	 System.out.println("AP Comp Sci \t"+c6);
	 System.out.println("English \t" + c8);
	 System.out.println("Latin  \t\t" + c1);
	 System.out.println("Economics \t"+ c4);
	 System.out.println("Chemistry \t" + c5);
	 System.out.println("PreCalculus \t"+c2);
	 System.out.println("STEM  \t\t"+c3);
	 System.out.println("Research \t"+ c5);
	 System.out.println();
	 
	 // Math class, random: see pages 86 - 89
	 gpa = (c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8)/8;
	 
	 // is value of "gpa" correct?   
	 System.out.println("GPA: \t" + gpa);
	 
	 // what happens if you remove the parenthesis around Math.random() * 100?
	 APCSgrade = (int) (Math.random() * 100);
	 System.out.println("I think my final grade will be " + APCSgrade);
	

	} // end of main

}  // end of class
