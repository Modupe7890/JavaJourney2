package Chapter4;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num ;
        System.out.println("Enter a number to calculate its Factorial: ");
        num = input.nextInt();

        int factorial = 0;


        for (num =1; num >=0; num *= 1){
            System.out.printf("Factorial of"+num+ "is " );
        }
        ++factorial;


    }
}
