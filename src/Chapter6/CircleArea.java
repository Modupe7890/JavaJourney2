package Chapter6;
import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter value for radius of a circle: ");
        double radius = input.nextDouble();

        double area = circleArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

    }
    public static double circleArea(double radius){

        double area = Math.PI * Math.pow(radius, 2);
        return area;






    }
}
