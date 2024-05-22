package Chapter7b;

import java.io.IOException;

public class TaskMaxArray {
    public static void main(String[] args) throws IOException {
        // Find maximum number in an array
        int[] numbers = {2,4,5,7,8,10,3,12,15,14,9,17,19,20,1,6,18,11,4,16};

        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Max is " +max);
    }
}
