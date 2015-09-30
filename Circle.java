//**********************************************************
//  Circle.java
//
//  Print the area of a circle with two different radii
//**********************************************************
import java.util.Scanner;
public class Circle
{
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     final double PI = 3.14159;
     
     System.out.println("Input two values for radii, seperated by spaces");
     int radius1 = scan.nextInt();
     int radius2 = scan.nextInt();
     double area = PI * radius1 * radius1;
     double circumference = 2 * PI * radius1;
     double area1 = area;
     double circum1 = circumference;

     System.out.println("The area of a circle with radius " + radius1 +
                        " is " + area);
     System.out.println("The circumference of a circle with radius " + radius1 + " is " + circum1);

     double area2 = PI * radius2 * radius2;
     double circumference2 = PI * radius2 * 2;
     double areaFactor = area2 / area1;
     System.out.println("The area of a circle with radius " + radius2 +
                        " is " + area2);
     System.out.println("The circumference of a circle with radius " + radius2 + " is " + circumference2);
     System.out.println("The factor for change in area is " + areaFactor);

  
     

    } // end of main
} // end of class
