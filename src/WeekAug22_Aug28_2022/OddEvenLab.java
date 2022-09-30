package WeekAug22_Aug28_2022;

import java.util.Scanner;

public class OddEvenLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a whole number :: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is odd :: false");
            System.out.println(number + " is even :: true");
        } else if (number % 2 == 1) {
            System.out.println(number + " is odd :: true");
            System.out.println(number + " is even :: false");
        } else {
            System.out.println("There is a Problem!");
        }
    }
}
