package WeekSep26_Sep30_2022;

import java.util.Scanner;

public class Sep29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        double total = 0.0;
        while(num >= 1) {
            total = total + (num % 10);
            num /= 10;
            System.out.println(num);
            System.out.println(num % 10);
            System.out.println(total);
        }
        System.out.println(total);
        System.out.println("Enter a number");
        double total1 = 0.0;
        for(int num1 = scan.nextInt(); num1 >= 1; num1 /=10) {
            total1+=(num1 % 10);
            System.out.println(num1);
            System.out.println(num1 % 10);
            System.out.println(total1);
        }
        System.out.println(total1);


    }
}
