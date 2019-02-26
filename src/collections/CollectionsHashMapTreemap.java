package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsHashMapTreemap {
    public static void main(String[] args) {
        Map<Integer, String> myHashMap = new HashMap<>();  //внутри не гарантируется порядок значени
        Map<Integer, String> myLinkedHashMap = new LinkedHashMap<>();   // в каком порядке были добавлены пары так они и вернутся
        Map<Integer, String> myTreeMap = new TreeMap<>();   //пары ключ - значение сортируются по ключу (natural order)
        testMap(myHashMap);
        System.out.println();
        testMap(myLinkedHashMap);
        System.out.println();
        testMap(myTreeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(1, "Dima");
        map.put(12, "Vasea");
        map.put(32, "Jora");
        map.put(78, "Ghregory");
        map.put(7, "Valera");

        for (Map.Entry<Integer, String> entry :
                map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
