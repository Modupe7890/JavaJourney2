package Chapter8;

public class Cylinder{
    private double radius;
    private double height;

    // constructors
    public Cylinder(){
        this.radius = 1.0;
        this.height =  1.0;

    }
    // Parameterized constructor to set radius and height
    public Cylinder(double radius, double height) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1.0; // Default value
        }
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1.0; // Default value
        }
    }
    // Setter for radius with validation
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be a positive number. Setting to default value 1.");
            this.radius = 1.0; // Default value
        }
    }
    // Getter for radius
    public double getRadius() {
        return radius;
    }
    // Setter for height with validation
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height must be a positive number. Setting to default value 1.");
            this.height = 1.0; // Default value
        }
    }
    //Getter for height
    public double getHeight() {
        return height;
    }
    // Method to calculate the volume of the cylinder
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
