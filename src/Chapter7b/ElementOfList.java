package Chapter7b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElementOfList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Rain");
        list.add("In");
        list.add("Spain");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
