package Chapter5;

public class OddProduct {
    public static void main(String[] args) {
        int product = 2;
        for (int counter = 1; counter <= 15; counter +=2){

            product += counter ;

            System.out.printf("Product is %d%n", product);
        }
    }
}
