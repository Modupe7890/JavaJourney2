package Chapter7b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ElementOfMap {
    public static void main(String[] args) {
        //All elements are stored in pairs

        Map<String, String> map = new HashMap<>();
        map.put("first", "Rain");
        map.put("second", "In");
        map.put("third", "Spain");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){

            // Get a key-value pair
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println("key"+ ";" +"value");
        }
    }
}
