package Chapter4;
// Solving the class average problem using counter-controlled repetition

import java.util.Scanner;
public class ClassAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total =0;
        int gradeCounter = 1;

        while (gradeCounter <= 10){
            System.out.println("Enter Grade: ");
            int grade = input.nextInt();

            total= total + grade; // add total to grade
            gradeCounter = gradeCounter + 1; // increment counter by 1

            int average = total /10;
            System.out.printf("Total of all 10 grades is %d%n", total);
            System.out.printf("Class of Average is %d%n", average);
        }
    }
}
