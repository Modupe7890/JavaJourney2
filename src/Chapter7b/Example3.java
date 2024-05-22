package Chapter7b;

import java.io.IOException;
//Display an array on the screen
public class Example3 {
    public static void main(String[] args) throws IOException {
        int[] list = new int[10];

        // Fill the array
        for (int i = 0; i < list.length; i++)
            list[i] = i;

        // Display the contents of the array
        for (int i = 0; i < list.length; i++) {

            System.out.println(list[i]);
        }
    }
}
