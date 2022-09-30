package WeekAug22_Aug28_2022;

import java.util.Scanner;

public class Aug23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a adjective.");
        String adjective = input.nextLine();
        System.out.println("Enter a noun.");
        String noun = input.nextLine();
        System.out.println("Enter a adverb ending in 'ing'.");
        String adverb = input.nextLine();
        System.out.println("Enter a color.");
        String color = input.nextLine();
        System.out.println("Enter a verb.");
        String verb = input.nextLine();
        System.out.println("Enter a name.");
        String name = input.nextLine();
        System.out.println("Enter a age.");
        String age = input.nextLine();
        System.out.println("Enter a word for exclamation.");
        String exclamation = input.nextLine();

        System.out.println("Dr. " + name + " was very " + adjective + ". Dr. " + name + " hated " + noun + " so much they " + verb + " life. Dr. " + name + " had been a teacher for " + age + "years and now was " + adverb + " depressed. All of Dr. " + name + "'s teaching made there face turn " + color + ". A quote from Dr. " + name + " said '" + exclamation + " ive been working to long!");


    }
}
