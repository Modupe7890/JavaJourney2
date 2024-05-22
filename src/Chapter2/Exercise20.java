package Chapter2;
//Exercise2.24
import java.util.Scanner;
public class Exercise20 {
    // A program that accepts 5 integers and displays the largest or smallest
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        System.out.print("Enter the first Number: ");
        number1 = input.nextInt();
        System.out.print("Enter the second Number: ");
        number2 = input.nextInt();
        System.out.print("Enter the third Number: ");
        number3 = input.nextInt();
        System.out.print("Enter the fourth Number: ");
        number4 = input.nextInt();
        System.out.print("Enter the fifth Number: ");
        number5 = input.nextInt();

        if (number1>number2&&number1>number3&&number1>number4&&number1>number5){
            System.out.printf("Number1 is the largest number %d%n", number1);
        }
        if (number2>number1&&number2>number3&&number2>number4&&number2>number5){
            System.out.printf("Number2 is the largest number %d%n", number2);
        }
        if (number3>number1&&number3>number2&&number3>number4&&number3>number5){
            System.out.printf("Number3 is the largest number %d%n", number3);
        }
        if (number4>number1&&number4>number2&&number4>number3&&number4>number5){
            System.out.printf("Number4 is the largest number %d%n", number4);
        }
        if (number5>number1&&number5>number2&&number5>number3&&number5>number4){
            System.out.printf("Number5 is the largest number %d%n", number5);
        }


        if (number1<number2&&number1<number3&&number1<number4&&number1<number5){
            System.out.printf("Number1 is the smallest number %d%n", number1);
        }
        if (number2<number1&&number2<number3&&number2<number4&&number2<number5){
            System.out.printf("Number2 is the smallest number %d%n", number2);
        }
        if (number3<number1&&number3<number2&&number3<number4&&number3<number5){
            System.out.printf("Number3 is the smallest number %d%n", number3);
        }
        if (number4<number1&&number4<number2&&number4<number3&&number4<number5){
            System.out.printf("Number4 is the smallest number %d%n", number4);
        }
        if (number5<number1&&number5<number2&&number5<number3&&number5<number4){
            System.out.printf("Number5 is the smallest number %d%n", number5);
        }



    }

    }

