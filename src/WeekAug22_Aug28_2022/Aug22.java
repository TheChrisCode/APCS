package WeekAug22_Aug28_2022;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Aug22
{
    public static void main(String[] args)
    {
        String str1 = "This is a string literal.";
        String str2 = new String("This is instantiated.");
        // To instantiate is to create an object from a class
        //When you use new, you need to also provide a class constructor
        //A class constructor is a special method of a class
        //that builds the object and gives it a starting value

        // When you make an object, the variable that stores it
        //is called the reference variable

        //keyboard input in Java
        // Scanner class -> scans for input and can be used to get keyboard input or file input
        // To use Scanner, you need to first create a Scanner object and then use its methods

        // Create a Scanner object
        Scanner yourMom = new Scanner(System.in);
        System.out.println("Please Enter Your grade in your class.");
        int grade = yourMom.nextInt();
        yourMom.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(grade);

        System.out.println("What is your name?");

        String name = yourMom.nextLine();
        System.out.println("The name " + name + " is stupid!");
    }
}
