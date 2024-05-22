package Chapter7b;
//Quick (static) initialization. Add up the array elements
import java.io.IOException;
public class Example4 {
    public static void main(String[] args) throws IOException {

        // Static Initialization
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        //Calculate the sum
        int sum = 0;
        for(int i = 0; i < list.length; i++){
            sum += list[i];

            System.out.println("Sum is " +sum);
        }

    }
}
