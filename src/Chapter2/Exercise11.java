package Chapter2;
import java.util.Scanner;
public class Exercise11{
    //A program that displays number 1 to 4
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("1 2 3 4" ); // Using one System.out.println statement.

        //Using four System.out.print statements.
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4 ");

        //Using one System.out.printf statement.
        System.out.printf("%s%n%s%s%s%s%n"," ",
                     "1 ","2 ","3 ","4 ");
    }
}
