package Chapter4;
// Solving average class problem using sentinel-controlled repetition

import java.util.Scanner;
public class ClassAverageSenti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // initialization phase
        int total = 0;
        int gradeCounter = 0;

        // prompt for input and read grade from user
        System.out.println("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        // processing phase
        // loop until sentinel value read from user
        while (grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            // prompt for input and read grade from user
            System.out.println("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        // termination phase
        // if user enter at least one grade
        if (gradeCounter != 1){
            // use number with decimal point to calculate average of grades
            double average = (double) total / gradeCounter;

            //display total and average (with two digits of precision)
            System.out.printf("%nTotal of the %d grades entered is %d%n",gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else{
            // no grades were entered, so output appropriate message
            System.out.println("No grades were entered");
        }

    }
}
