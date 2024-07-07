package Chapter7b;

public class Factorial {
    public static long getFactorial(final int number){
            long fact = 1;
            for(int i = 1; i <= number; i++){
                fact = fact * i;
            }
            return fact;
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(-5));
        System.out.println(getFactorial(21));
    }
}
