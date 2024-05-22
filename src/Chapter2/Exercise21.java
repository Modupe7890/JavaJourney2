package Chapter2;
// Exercise2.25
import java.util.Scanner;
public class Exercise21 {
    // A program of even and odd numbers
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Integer: ");
        int x= input.nextInt();

        if (x % 2==0){
            System.out.println("The number is an even number" );
        }
        if (x % 2==1){
            System.out.println("The number is an odd number" );
        }

    }



}
