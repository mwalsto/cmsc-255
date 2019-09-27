/****************************************************************************
* TriCircleSign.java
****************************************************************************
* This program takes in the side length of a triangle along with a string of 
words to calculate the price of sign in the shape of an equilateral triangle 
that is encased in a circle.
*____________________________________________________________________________
* September 26, 2019
* CMSC 255-001
****************************************************************************/

import java.util.Scanner;
public class TriCircleSign {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
	
		//1.	Enter lengthSide & signString
		// user inputs length and string and variables are assigned
		System.out.println("Enter the length of a side of your triangle:");
		double lengthSide = input.nextDouble();
		input.nextLine();
		
		System.out.println("Enter the string you would like on your sign:");
		String signString = input.nextLine();
		
		//2.	Create constant Pi for double 3.14159265359
		final double PI = 3.14159265359;
		
		//3.	Calculate s, then radius, then area from given formulas and lengthSide
		// calculations are layed out and assigned variables
		double s = (3 * lengthSide) / 2;
		double radius = (Math.pow(lengthSide, 3)) / (4 * Math.sqrt(s * Math.pow(s - lengthSide, 3)));
		double area = PI * Math.pow(radius, 2);

		/* 4.	Calculate price per square foot by multiplying area by 2.35 and set equal to costArea
		5.	Find the number of characters in the string & multiply by 1.45 and set equal to costString
		6.	Add costString to costArea and set to costSign */

		// cost of the triangle by square feet, the words on it, and the total cost all together
		double costArea = area * 2.35;
		double costString = (signString.replace(" ", "").length()) * 1.45;
		double costSign = costArea + costString;

		/* 7.	Display costSign
		8.	Ask user for input, if quit program will end, if yes while loop will begin */

		// output of price to the user
		System.out.printf("$%.2f%n", costSign);
		System.out.println("Would you like to create another sign? Enter quit to exit.");
		String keepGoing = input.nextLine().trim();

		// sentinial value
		String quit = "quit" ;

		/* 9.	Create while loop
					a.	Set sum to zero (ommited, was unnecessary)
					b.	Enter lengthSide & signString
					c.	Calculate s, then radius, then area from given formulas and lengthSide
					d.	Calculate price per square foot by multiplying area by 2.35 and set equal to costArea
					e.	Find the number of characters in the string & multiply by 1.45 and set equal to costString
					f.	Add costString to costArea and set to sum
					g.	Display sum(costSign)
					h.	Continue loop until user enters quit. */

		while (!keepGoing.equals(quit)) {
			System.out.println("Enter the length of a side of your triangle:");
			lengthSide = input.nextDouble();
			input.nextLine();

			System.out.println("Enter the string you would like on your sign:");
			signString = input.nextLine();

			// calculations are layed out and assigned variables
			s = (3 * lengthSide) / 2;
			radius = (Math.pow(lengthSide, 3)) / (4 * Math.sqrt(s * Math.pow(s - lengthSide, 3)));
			area = PI * Math.pow(radius, 2);

			// cost of the triangle by square feet, the words on it, and the total cost all together
			costArea = area * 2.35;
			costString = (signString.replace(" ", "").length()) * 1.45;
			costSign = costArea + costString;

			// output of price to the user
			System.out.printf("$%.2f%n", costSign);
			System.out.println("Would you like to create another sign? Enter quit to exit.");
			keepGoing = input.nextLine().trim();


		}
		
	}
}
