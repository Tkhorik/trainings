package collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsArrayList {
    public static void main(String[] args) {
        int[] x = new int[3];
        for (int i = 0; i < x.length; i++) {
            x[i] = 1 + i;
        }
        for (int x1 : x) {
            System.out.println(x1);

        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);

        }

        //for each
        arrayList.forEach(System.out::println);

        //for each
        arrayList.forEach(System.out::println);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i);
        }
        //for each (lambda)
        arrayList.forEach((n) -> System.out.println(n));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.get(50));
        System.out.println(arrayList.size());
        arrayList.remove(arrayList.size() - 1);
        System.out.println(arrayList.size());

        //ПО конвенциям считается правильным ссылаться на интревеейсы которые вышее чтобы получать методы дополнительные для требуемой коллекции
        List<Integer> anyListFromCollection = new ArrayList<>();
        // например тут мы начинаем много удаять из коллекции элементов
        anyListFromCollection = new LinkedList<>();
        anyListFromCollection = arrayList;
        anyListFromCollection.clear();
        System.out.println(anyListFromCollection+" = anyListFromCollection");
    }
}
