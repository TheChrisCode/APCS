package WeekAug29_Sep4_2022;

import java.util.Scanner;

public class SimpleAdventureGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You Punched Your Sister because she was Bullying You. You wake up to find your self in what seems to be rooms with moist carpet and fluorescent flickering lights.\n1. stay where you are \n2. keep moving\nPlease enter the number 1 or 2!");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("You are getting board! You should Keep moving! \n1. stay where you are\n2. keep moving\nPlease enter the number 1 or 2!");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("You Are Going insane the fluorescent lights are making you dizzy! YOU SHOULD KEEP MOVING! \n1. stay where you are\n2. keep moving\nPlease enter the number 1 or 2!");
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("You start seeing things. You feel a strong will to start moving. YOU NEED TO LEAVE NOW!!!! \n1. stay where you are\n2. keep moving\nPlease enter the number 1 or 2!");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.println("You pass out. You wake up and find you are back in reality.");
                        return;
                    } else {
                        System.out.println("You phase out of existence!");
                        return;
                    }
                } else {
                    System.out.println("You see a hole in the wall. \n1. go in it\n2. commit seppuku\nPlease enter the number 1 or 2!");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.println("Congratulations you made it to level -1.");
                        return;
                    } else {
                        System.out.println("YOU DIE!");
                        return;
                    }
                }
            } else {
                System.out.println("In the next room you see a wall that does not look right.\n1. touch the wall\n2. keep moving\nPlease enter the number 1 or 2!");
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("Congratulations you made it to level 2 the 'Pipe Dream'");
                    return;
                } else {
                    System.out.println("You are stuck in level 1 forever and you die from old age.");
                    return;
                }
            }
        } else {
            System.out.println("You walk into the next room and find a desk. \n1. go to the next room\n2. walk to the desk\nPlease enter the number 1 or 2!");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("You find a hallway with a entity at the end. \n1. Approach the entity\n2. RUN AWAY!\nPlease enter the number 1 or 2!");
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("The entity jumps at you. \n1. Embrace It\n2. RUN AWAY!\nPlease enter the number 1 or 2!");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.println("YOU DIE!!!");
                        return;
                    }
                } else {
                    System.out.println("You run so fast you return to reality. But you die because you return in outerspace.");
                    return;
                }
            } else {
                System.out.println("You find a picture with words saying you can never leave!\n1. give up\n2. use will power to get yourself out\nPlease enter the number 1 or 2!");
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("You gave up on life so you are erased from everything that was, is, and will be.");
                    return;
                } else {
                    System.out.println("You return to a broken reality!");
                    return;
                }
            }
        }

    }
}
