package Chapter7b;

import java.util.ArrayList;
import java.util.List;

public class ShortHandElementOfList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Rain");
        list.add("In");
        list.add("Spain");

        for (String text : list){
            System.out.println(text);
        }
    }
}
