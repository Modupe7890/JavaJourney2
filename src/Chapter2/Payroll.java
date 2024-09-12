package Chapter2;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b = 0;
        int c =0;

        System.out.println("Enter an Integer: ");
        b = input.nextInt();
        System.out.println("Enter an integer: ");
        c = input.nextInt();

         a = b * c;
        System.out.printf("Sum is %d%n", a);
    }
}
