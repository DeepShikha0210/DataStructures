package HashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapUse {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        //insert
        map.put("abc", 1);
        map.put("def", 2);
        map.put("abc1",3);
        map.put("def2",4);
        System.out.println(map.size());

        if(map.containsKey("abc"))
            System.out.println("true");

        if(map.containsValue(1))
            System.out.println("yes");

        if(map.containsKey("def"))
            System.out.println(map.get("def"));

        int s = map.remove("abc");
        System.out.println(s);

        Set<String> keys = map.keySet();
        for(String str : keys)
            System.out.println(str);

        // Using iterator
        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)iterator.next();
            System.out.println(mapElement.getKey() + " : " + (int)mapElement.getValue());
        }

        // Using for-each loop
        for (Map.Entry mapElement : map.entrySet()) {

            String key = (String)mapElement.getKey();
            int value = (int)mapElement.getValue();

            System.out.println(key + " : " + value);
        }


        //Using forEach Method (JAVA 8)
        map.forEach((k, v) -> System.out.println(k + " : " + v));

    }

}
