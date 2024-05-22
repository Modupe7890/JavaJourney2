package Chapter2;
// Making a Difference Question 1
//Exercise 2.33
import java.util.Scanner;
public class BodyMassIndex {
    // A program that calculate the BMI of a person
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a correct detail to get an accurate BMI result");
        System.out.println("-----------------------------------------------------------");

        double weight;
        double height;
        double BMI;

        System.out.println("Enter the user's Weight in Kilogram:  ");
        weight = input.nextDouble();
        System.out.println("Enter the user's Height in Meter:  ");
        height = input.nextDouble();

        BMI = ((weight) / (height * height));

        System.out.println("YOUR BMI VALUES ");

        if (BMI < 18.5) {
            System.out.printf("%s You are Underweight %n", BMI);
        }
        if (BMI >= 18.5 && BMI <= 24.5) {
            System.out.printf("%s Your BMI is Normal %n",BMI);
        }
        if (BMI >=25 && BMI <= 29.9) {
            System.out.printf("%s You are Overweight %n", BMI);
        }
        if (BMI >= 30){
            System.out.printf("%s You are obese %n",BMI);
        }
    }
}
