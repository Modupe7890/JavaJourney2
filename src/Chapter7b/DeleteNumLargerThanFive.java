package Chapter7b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DeleteNumLargerThanFive {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);

        for (int i = 0; i < list.size();){
            if(list.get(i) > 5){
                list.remove(i);
            } else {
                i++;
            }
        }
    }
}
