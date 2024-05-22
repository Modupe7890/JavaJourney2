package Chapter7b;

import java.util.Arrays;

public class ExampleA {
    public static void main(String[] args) {
    //10-element array with numbers from 1 to 10:
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
