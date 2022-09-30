package WeekSep19_Sep23_2022;

import java.util.Scanner;

public class Sep23 {
    public static void main(String[] args) {
        int play = 0;
        int stop = 1;
        String percent = "";
        while (play != 1) {
            double count = 1 + 0.0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter range of numbers to guess from?");
            double numRange = scan.nextDouble() + 0.0;
            double randNumber = Math.floor((Math.random() * numRange) + 1) + 0.0;
            System.out.println("Pick a number between 1 and " + numRange + ".");
            double guessNumber = scan.nextDouble() + 0.0;
            if (guessNumber == randNumber) {
                System.out.println("It took " + count + " guesses to guess " + randNumber + ".");
                percent = String.format("%.2f", ((count - 1) / count) * 100);
                System.out.println("You guessed wrong " + percent + "% percent of the time.");
                stop = 0;
                    while (stop != 1) {
                        System.out.println("Enter a number:\n1.Play Again\n2.Stop");
                        int again = scan.nextInt();
                        if (again == 1) {
                            stop = 1;
                        } else if (again == 2) {
                            stop = 1;
                            play = 1;
                            return;
                        } else {
                            System.out.println("Invalid Input!");
                        }
                    }
                }
                while (guessNumber != randNumber) {
                    if (guessNumber < 1 || guessNumber > numRange) {
                        System.out.println("Number out of Range!");
                        System.out.println("Pick a number between 1 and " + numRange + ".");
                        guessNumber = scan.nextDouble() + 0.0;
                        count++;
                        if (guessNumber == randNumber) {
                            System.out.println("It took " + count + " guesses to guess " + randNumber + ".");
                            percent = String.format("%.2f", ((count - 1) / count) * 100);
                            System.out.println("You guessed wrong " + percent + "% percent of the time.");
                            stop = 0;
                            while (stop != 1) {
                                System.out.println("Enter a number:\n1.Play Again\n2.Stop");
                                int again = scan.nextInt();
                                if (again == 1) {
                                    stop = 1;
                                } else if (again == 2) {
                                    stop = 1;
                                    play = 1;
                                    return;
                                } else {
                                    System.out.println("Invalid Input!");
                                }
                            }
                        } else if (guessNumber >= 1 || guessNumber <= numRange) {
                        } else {
                            System.out.println("Number out of range!");
                        }
                    }
                    System.out.println("Pick a number between 1 and " + numRange + ".");
                    guessNumber = scan.nextDouble() + 0.0;
                    System.out.println(count);
                    count++;
                    if (guessNumber == randNumber) {
                        System.out.println("It took " + count + " guesses to guess " + randNumber + ".");
                        percent = String.format("%.2f", ((count - 1) / count) * 100);
                        System.out.println("You guessed wrong " + percent + "% percent of the time.");
                        stop = 0;
                        while (stop != 1) {
                            System.out.println("Enter a number:\n1.Play Again\n2.Stop");
                            int again = scan.nextInt();
                            if (again == 1) {
                                stop = 1;
                            } else if (again == 2) {
                                stop = 1;
                                play = 1;
                                return;
                            } else {
                                System.out.println("Invalid Input!");
                            }
                        }
                    } else if (guessNumber >= 1 || guessNumber <= numRange) {
                    } else {
                        System.out.println("Number out of range!");
                    }
                }

            }
        }
}
