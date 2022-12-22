package ru.mirea.task27;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Shalomeenko","Andrey");
        map.put("Korpalo","Roman");
        map.put("Tarakanov","Vyacheslav");
        map.put("Krotov","Pavel");
        map.put("Gaydenko","Mikhail");
        map.put("Korpalo","Roman");
        map.put("Chernushova","Lina");
        map.put("Smirnov","Artem");
        map.put("Ionova","Polina");
        map.put("Zhosanu","Nikoleta");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> s : copy.entrySet()) {
            for (Map.Entry<String, String> s2 : copy.entrySet()) {
                if(s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())) removeItemFromMapByValue(map,s.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}