package Chapter7b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EvenOddArray {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0) {    // If x is even
                even.add(x);   // Add x to the collection of even numbers

            } else {
                odd.add(x);// Add x to the collection of odd numbers
            }
        }
        for(int i  =0; i < even.size(); i++){
            System.out.println("The even numbers in the list are :: ::: :: " +even.get(i));
        }

        for(int i  =0; i < odd.size(); i++){
            System.out.println("The odd numbers in the list are :: ::: :: " +odd.get(i));
            System.out.println("The odd numbers in the list are :: ::: :: " +odd.get(i));
        }



    }
}
