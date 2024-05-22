package Chapter6;
import java.util.Scanner;
// Calculating the volume of a Sphere
public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the Sphere");
        double radius = input.nextDouble();

        System.out.printf("Volume is %f%n", sphereVolume(radius));
    }
    public static double sphereVolume(double radius){
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}
