package collections;

import java.util.HashMap;
import java.util.Map;

public class CollectitonHashMap {
    public static void main(String[] args) {
        Map<Integer, String> ourHashmap = new HashMap<>();
        ourHashmap.put(1, "One");
        ourHashmap.put(2, "Hello");
        ourHashmap.put(3, "ups");
        ourHashmap.put(4, "There");
        ourHashmap.put(5, "is");
        ourHashmap.put(6, "a");
        ourHashmap.put(7, "bird");
        System.out.println(ourHashmap);
        ourHashmap.put(7, "bear");
        System.out.println(ourHashmap);

        for (Map.Entry<Integer, String> entry : ourHashmap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.print(key + " " + value+" ");
            //вывод - хеш мэп не гарантирует порядка, там используется хеширование
        }
    }
}
