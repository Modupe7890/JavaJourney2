package Chapter7;

public class VariableArguList {
    public static void main(String[] args) {
        System.out.printf("The product of 2 * 3 is: %d %n", product(2,3));
        System.out.printf("The product of 3 * 4 * 2 is: %d %n", product(3,4,2));
        System.out.printf("The product of 8 * 10 is: %d %n", product(8,10));
    }
    public static int product(int... number){
        int product = 1;
        for(int value : number){
            product *= value;
        }
        return product;
    }
}
