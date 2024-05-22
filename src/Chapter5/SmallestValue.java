package Chapter5;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int counter = 0;
        int smallest = 0;

        System.out.println("Enter numbers between 1 to 9");

        System.out.println("Enter number: ");
        number = input.nextInt();

        while (counter <= 9){
            if (number < smallest){
                smallest = number;
            }
            counter++;
            System.out.printf("The smallest numbers is:"+smallest);
        }
    }
}
