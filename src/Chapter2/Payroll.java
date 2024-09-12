package Chapter2;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d ;
        int Cal;

        System.out.println("Enter an Integer for a: ");
        a = input.nextInt();
        System.out.println("Enter an Integer for b: ");
        b = input.nextInt();
        System.out.println("Enter an integer for c: ");
        c = input.nextInt();
        System.out.println("Enter an Integer for d: ");
        d = input.nextInt();

        Cal = a * b / (c + d) * 5;
        System.out.printf("The correct answer is %s%n", Cal);
    }
}
