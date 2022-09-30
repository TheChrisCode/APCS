package WeekSep12_Sep16_2022.Sep16_Test;

import java.util.Scanner;

public class StringRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: \n>>" );
        String word = scan.nextLine();
        System.out.println("Please enter another Sting: \n>>");
        String letter = scan.nextLine();

        StringStuff Stuff = new StringStuff();

        System.out.println(Stuff.middle(word));
        System.out.println(Stuff.firstLastTwo(word));
        System.out.println(Stuff.sumIndices(word, letter));
        System.out.println(Stuff.exceptFirstLast(word));
    }
    // main method goes in this class
    
   



}