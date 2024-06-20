package Chapter7b;

import java.util.HashMap;
import java.util.Map;

public class ShortHandForMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("first", "Rain");
        map.put("second", "In");
        map.put("third", "Spain");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();                      // Key
            String value = pair.getValue();                  // Value
            System.out.println(key + ":" + value);
        }
    }
}
