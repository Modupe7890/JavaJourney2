package Chapter2;
//Exercise 2.31
import java.util.Scanner;
public class TablesOfSquares {
    // An application that calculate Squares and cubes of number 1 to 10
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int zero;
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int number6;
        int number7;
        int number8;
        int number9;
        int number10;
        int square;
        int cube;

        System.out.print("Enter zero: ");
        zero = input.nextInt();
        System.out.print("Enter number 1:  ");
        number1 = input.nextInt();
        System.out.print("Enter number 2:  ");
        number2 = input.nextInt();
        System.out.print("Enter number 3:  ");
        number3 = input.nextInt();
        System.out.print("Enter number 4:  ");
        number4 = input.nextInt();
        System.out.print("Enter number 5:  ");
        number5 = input.nextInt();
        System.out.print("Enter number 6:  ");
        number6 = input.nextInt();
        System.out.print("Enter number 7:  ");
        number7 = input.nextInt();
        System.out.print("Enter number 8:  ");
        number8 = input.nextInt();
        System.out.print("Enter number 9:  ");
        number9 = input.nextInt();
        System.out.print("Enter number 10:  ");
        number10 = input.nextInt();

        System.out.println("Number               Square                      Cube");
        System.out.println(zero+"                      "+zero*zero+ "                         " + zero*zero*zero);

        System.out.println(number1+"                      "+number1*number1 + "                         " + number1*number1*number1);

        System.out.println(number2+"                      "+number2*number2 + "                         " + number2*number2*number2);

        System.out.println(number3+"                      "+number3*number3 + "                         " + number3*number3*number3);

        System.out.println(number4+"                      "+number4*number4 + "                        " + number4*number4*number4);

        System.out.println(number5+"                      "+number5*number5 + "                        " + number5*number5*number5);

        System.out.println(number6+"                      "+number6*number6 + "                        " + number6*number6*number6);

        System.out.println(number6+"                      "+number7*number7 + "                        " + number7*number7*number7);

        System.out.println(number8+"                      "+number8*number8 + "                        " + number8*number8*number8);

        System.out.println(number9+"                      "+number9*number9 + "                        " + number9*number9*number9);

        System.out.println(number10+"                     "+number10*number10 + "                      " + number10*number10*number10);
    }


}
