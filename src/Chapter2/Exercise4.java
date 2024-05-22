package Chapter2;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter a Number: ");
        number = input.nextInt();

        if (number!=7){
            System.out.println("The variable number is not equal to 7");
        }
    }
}
