package Chapter4;
import java.util.Scanner;
public class Assessment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int grade;
        System.out.println("Enter Grade: ");
        grade = input.nextInt();
        if (grade >= 60){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
            System.out.println("You must take the course again");
        }



    }
}
