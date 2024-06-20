package Chapter7b;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TaskElementOfSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Stop");
        set.add("Looking");
        set.add("Listen");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {

            String text = iterator.next();
            System.out.println(text);
        }
    }
}
