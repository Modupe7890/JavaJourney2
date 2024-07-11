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
        return new ComplexNumbers(real, imag);
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
}
