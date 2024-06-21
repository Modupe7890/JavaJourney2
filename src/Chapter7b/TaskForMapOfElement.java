package Chapter7b;

import java.util.HashMap;
import java.util.Map;

public class TaskForMapOfElement {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Watermelon:", "Melon");
        map.put("Banana:", "Fruit");
        map.put("Cherry:","Fruit");
        map.put("Pear:", "Fruit");
        map.put("Cantaloupe:", "Melon");
        map.put("Blackberry:", "Fruit");
        map.put("Ginseng:", "Root");
        map.put("Strawberry:", "Fruit");
        map.put("Iris:", "Flower");
        map.put("Potato:", "Tuber");

        for(Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key+ ":" +value);
            System.out.println(key+ ":" +value);
            System.out.println(key+ ":" +value);
        }
    }
}
