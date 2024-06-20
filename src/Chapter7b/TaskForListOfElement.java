package Chapter7b;

import java.util.ArrayList;
import java.util.List;

public class TaskForListOfElement {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Pear");
        list.add("Cherry");
        list.add("Blackberry");
        list.add("Ginseng");
        list.add("Strawberry");
        list.add("Potato");

        for(String text : list){
            System.out.println(text);
        }

    }
}
