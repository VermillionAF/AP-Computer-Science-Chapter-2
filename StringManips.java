// ***************************************************************
//   StringManips.java
//
//   Test several methods for manipulating String objects
// ***************************************************************

import java.util.Scanner;

public class StringManips
{
    public static void main (String[] args)
    {
	String phrase = new String ("This is a String test.");
	int phraseLength;   // number of characters in the phrase String
	int middleIndex;    // index of the middle character in the String
	String firstHalf;   // first half of the phrase String
	String secondHalf;  // second half of the phrase String
	String switchedPhrase; // a new phrase with original halves switched
	String middle3; // the middle three characters of phrase
	
	// prompt the user to enter city and state
	
	System.out.println("Please enter your city and state.");
	Scanner scan = new Scanner(System.in);
	String city = scan.nextLine();
	String state = scan.nextLine();
	
	// modify the scanner string
	
	String stateUpper = state.toUpperCase();

	// compute the length and middle index of the phrase
	phraseLength = phrase.length();
	middleIndex = phraseLength / 2;

	// get the substring for each half of the phrase
	firstHalf = phrase.substring(0,middleIndex);
	secondHalf = phrase.substring(middleIndex, phraseLength);

	// concatenate the firstHalf at the end of the secondHalf
	switchedPhrase = secondHalf.concat(firstHalf);
	switchedPhrase = switchedPhrase.replace(' ', '*');
	
	// calculate the middle three characters of phrase
	middle3 = phrase.substring((middleIndex-1),(middleIndex+1));

	// print information about the phrase
	System.out.println();
	System.out.println ("Original phrase: " + phrase);
	System.out.println ("Length of the phrase: " + phraseLength +
			    " characters");
	System.out.println ("Index of the middle: " + middleIndex);
	System.out.println ("Character at the middle index: " + 
			    phrase.charAt(middleIndex));
	System.out.println ("Switched phrase: " + switchedPhrase);
	System.out.println ("Middle three characters: " + middle3);
	
	// print information with city and stateUpper
	
	System.out.println(stateUpper + city + stateUpper);

	System.out.println();
    } // end of main
} // end of class
