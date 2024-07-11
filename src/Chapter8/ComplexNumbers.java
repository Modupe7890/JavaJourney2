package Chapter8;

public class ComplexNumbers {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumbers(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public ComplexNumbers(){
        this(0,0 );
    }
    // Method to add two Complex numbers
    public ComplexNumbers add(ComplexNumbers other) {
        double real = this.realPart + other.realPart;
        double imaginary = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumbers(real, imaginary);
    }

    // Method to subtract two Complex numbers
    public ComplexNumbers subtract(ComplexNumbers other) {
        double real = this.realPart - other.realPart;
        double imaginary = this.imaginaryPart - other.imaginaryPart;
        return new ComplexNumbers(real, imaginary);
    }

    // Method to print the Complex number in the form (realPart, imaginaryPart)
    public void print() {
        System.out.println("(" + realPart + ", " + imaginaryPart + ")");
    }
    public static void main(String[] args) {
        // Create two Complex numbers
        ComplexNumbers c1 = new ComplexNumbers(3.5, 2.5);
        ComplexNumbers c2 = new ComplexNumbers(1.2, 3.8);

        // Print the original Complex numbers
        System.out.print("Complex number 1: ");
        c1.print();
        System.out.print("Complex number 2: ");
        c2.print();

        // Add the Complex numbers
        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.print();

        // Subtract the Complex numbers
        Complex difference = c1.subtract(c2);
        System.out.print("Difference: ");
        difference.print();
}
