package WeekSep12_Sep16_2022;

import WeekSep12_Sep16_2022.StringExamples1;

import java.util.Scanner;

public class StringEx1Runner {
	
    public static void main( String args[] ) {

        Scanner scan = new Scanner(System.in);
        // Ask user for two Strings
        System.out.println("Please enter a string: \n>>" );
        String a = scan.nextLine();
        System.out.println("Please enter another string: \n>>");
        String b = scan.nextLine();

        // Instantiate StringExamples1 class
        StringExamples1 strEx = new StringExamples1();
        

        // Print out average length of both Strings by calling avgLen method
        System.out.println(strEx.avgLen(a, b));

        // Print out first character of String a and last character of String b by calling firstLast method
        System.out.println(strEx.firstLast(a, b));

        // Print out middle character of String a by calling middle method
        System.out.println(strEx.middleCharacter(a));
    }
}