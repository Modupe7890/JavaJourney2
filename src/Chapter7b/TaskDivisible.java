package Chapter7b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskDivisible {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] data = {2,4,5,7,8,10,3,12,15,14,9,17,19,20,1,6,18,11,4,16};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < data.length; i++){
            list.add(data[i]);
        }
        ArrayList<Integer> divisibleBy2 = new ArrayList<>();
        ArrayList<Integer> divisibleBy3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0) {
                divisibleBy2.add(x);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 1) {
                divisibleBy3.add(x);
            }
        }
    }
}
