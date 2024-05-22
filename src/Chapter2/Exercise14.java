package Chapter2;
import java.util.Scanner;
public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int average;
        int sum;
        int product;

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;
        System.out.printf("Sum = %d%n ", sum);

        average = (number1+number2+number3)/3;
        System.out.printf("Average =%d%n", average);

        product = number1*number2*number3;
        System.out.printf("Product = %d%n", product);

        if (number1>number2&& number1>number3){
            System.out.printf("Number1 is the Largest %d%n", number1);
        }
        if (number2>number1&&number2>number3){
            System.out.printf("Number2 is the Largest %d%n", number2);
        }
        if  (number3>number1&&number3>number2){
            System.out.printf("Number3 is the Largest %d%n", number3);
        }
        if (number1<number2&&number1<number3){
            System.out.printf("Number1 is the smallest %d%n", number1);
        }
        if (number2<number1&&number2<number3){
            System.out.printf("Number2 is the smallest %d%n", number2);
        }
        if (number3<number1&&number3<number2){
            System.out.printf("Number3 is the smallest %d%n", number3);
        }

        }
    }


