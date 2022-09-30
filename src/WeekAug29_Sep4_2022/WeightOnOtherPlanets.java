package WeekAug29_Sep4_2022;

import java.util.Scanner;

public class WeightOnOtherPlanets {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("What Planet would you like?(enter number 1 to 4)\n1. Voltar\n2. Krypton\n3. Fertos\n4. Servontos");
        int planet = s.nextInt();
        System.out.println("What is your weight on earth?");
        double weight = s.nextDouble() / 1.0;
        switch(planet) {
            case 1:
                System.out.println("Your weight on Voltar is " + weight * 0.091);
                break;
            case 2:
                System.out.println("Your weight on Krypton is " + weight * 0.720);
                break;
            case 3:
                System.out.println("Your weight on Fertos is " + weight * 0.865);
            case 4:
                System.out.println("Your weight on Servontos is " + weight * 4.612);

        }
    }
}
