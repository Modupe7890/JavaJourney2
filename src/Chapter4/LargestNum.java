package Chapter4;

import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int num;
        int counter = 0;
        int largest = 0;

        System.out.println("Enter ten numbers: ");
        num = input.nextInt();

        while (counter <= 10){

            if (num > largest){
                largest = num;
            }
            counter ++;
            System.out.printf("The largest of %d numbers is: %d", counter, largest);
        }
    }
}
