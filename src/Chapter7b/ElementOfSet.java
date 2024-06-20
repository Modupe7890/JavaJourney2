package Chapter7b;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ElementOfSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("Rain");
        set.add("In");
        set.add("Spain");

        // Get an iterator for the set
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext());         // Check if there is another element

        // Get the current element and move to the next one
    }
}
