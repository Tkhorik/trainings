package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsLinkedList {
    public static void main(String[] args) {
        List<Integer> libnkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(libnkedList);
        measureTime(arrayList);
    }


    private static void measureTime(List<Integer> list) {
        final int dimension = 1001;

        for (int i = 0; i < dimension; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        list.forEach((n) -> list.get(n));
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}

