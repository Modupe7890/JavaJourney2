package Chapter2;
// Exercise 2.31
import java.util.Scanner;
public class NegativePositive {
    // A program that Display if a number is Positive or Negative
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1; int number2; int number3; int number4; int number5;

        System.out.println("Enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Enter the Second number: ");
        number2 = input.nextInt();
        System.out.println("Enter the third number: ");
        number3 = input.nextInt();
        System.out.println("Enter the fourth number: ");
        number4 = input.nextInt();
        System.out.println("Enter the fifth number: ");
        number5 = input.nextInt();

        if (number1>0){
            System.out.printf("%d is a positive number %n",number1);
        }
        if (number1<0){
            System.out.printf("%d is a negative number %n",number1);
        }
        if (number1==0){
            System.out.printf(" is zero %n");
        }
        if (number2>0){
            System.out.printf("%d is a positive number %n",number2);
        }
        if (number2<0){
            System.out.printf("%d is a negative number %n",number2);
        }
        if (number2==0) {
            System.out.println("is zero");
        }
        if (number3>0){
            System.out.printf("%d is a positive number %n",number3);
        }
        if (number3<0){
            System.out.printf("%d is a negative number %n",number3);
        }
        if (number3==0) {
            System.out.println("is zero");
        }
        if (number4>0){
            System.out.printf("%d is a positive number %n",number4);
        }
        if (number4<0){
            System.out.printf("%d is a negative number %n",number4);
        }
        if (number4==0) {
            System.out.println("is zero");
        }
        if (number5>0){
            System.out.printf("%d is a positive number %n",number5);
        }
        if (number5<0){
            System.out.printf("%d is negative number %n",number5);
        }
        if (number5==0) {
            System.out.println("is zero");
        }
    }
}
