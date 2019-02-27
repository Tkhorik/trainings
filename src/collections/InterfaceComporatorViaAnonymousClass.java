package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfaceComporatorViaAnonymousClass {
    public static void main(String[] args) {
        List<Integer> newListForComparison = new ArrayList<>();

        newListForComparison.add(2);
        newListForComparison.add(123);
        newListForComparison.add(55);
        newListForComparison.add(92929339);

        Collections.sort(newListForComparison, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        Collections.reverse(newListForComparison); //и дальше удже можно использовать реверс и все остальное
        System.out.println(newListForComparison);
    }
}