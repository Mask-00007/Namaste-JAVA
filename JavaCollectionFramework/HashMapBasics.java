package JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {

        Map<String, String> mapping = new HashMap<>();

        // Methods for map:
        // insertion -> put();
        mapping.put("in", "India");
        mapping.put("us", "USA");
        mapping.put("en", "England");
        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "brazil");
        System.out.println("befor: " + table);

        // putAll();
        table.putAll(mapping);
        System.out.println(table);

        // Deletion -> remove();
        table.remove("en");
        System.out.println(table);

        // size();
        System.out.println(table.size());

        // putIfAbsent();
        table.putIfAbsent("nz", "New Zealand");
        System.out.println(table);

        // replace();
        table.replace("in", "null");
        System.out.println(table);

        // keySet();
        System.out.println(table.keySet());

        // values();
        System.out.println(table.values());

        // entrySet();
        System.out.println(table.entrySet());

        // Iterating over a map;
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "One");
        m.put(2, "Two");
        m.put(3, "Three");

        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }

}
