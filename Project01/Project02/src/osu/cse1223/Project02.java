/*
 * Project01.java
 *  A simple program that uses various String methods, such as indexing substrings, 
 *  replacing substrings, and printing a modified long string.
 * 
 *  
 *  @author Shyam Thiagarajan
 *  @version 20150904
 *  
 *  EXTRA CREDIT
 *  In line 48 the program searches the 
 *  entered long string and tries to find the index of the shorter string. Because
 *  this shorter string does not exist in the longer string, the program returns an 
 *  index at -1, meaning the substring not exist in the larger string. 
 *  
 *  Line 48 is where the code has an error. To remedy this error, an if statement 
 *  needs to be added. In pseudocode, this if statement should read, " if the user 
 *  enters a substring contained in the larger string, the code can continue; if 
 *  the substring does not exist in the long string, then the program should print 
 *  the entered substring does not exist in the larger string."
 *  */
package osu.cse1223;

import java.util.Scanner;

public class Project02 {

	public static void main(String[] args) {
		
		//initializing Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompting user for long string and substring
		System.out.print("Enter a long string: ");
		String long_string = input.nextLine();
		System.out.print("Enter a substring: ");
		String short_string = input.nextLine();
		
		//Calculating and printing length of long_string
		int long_string_length = long_string.length();
		System.out.println("Length of your string: " + long_string_length);
		
		//Calculating and printing length of short_string
		int short_string_length = short_string.length();
		System.out.println("Length of you substring: " + short_string_length);
		
		//Finding and printing index of substring
		int index_of_substring = long_string.indexOf(short_string);
		System.out.println("Starting position of your substring in string: " + index_of_substring);
		
        //Printing substring before entered substring
		String string_before_substring = long_string.substring(0, index_of_substring);
		System.out.println("String before your substring: " + string_before_substring);
		
		//Printing substring after entered substring
		String string_after_substring = long_string.substring(index_of_substring+short_string_length, long_string_length);
		System.out.println("String after your substring: " + string_after_substring);
		
		//Printing character at user defined index
		System.out.print("Enter a position between 0 and " + (long_string_length-1) + ": ");
		int entered_number = input.nextInt();
		String refresher = input.nextLine(); //refreshing Scanner
		System.out.println("The character at position " + entered_number + " is " + long_string.charAt(entered_number));
		
		//Replacing selected string with user defined string
		System.out.print("Enter a replacement string: ");
		String replacement = input.nextLine();
		String new_long_string = long_string.replace(short_string, replacement);
		System.out.println("Your new string is: " + new_long_string);
		
	}

}
