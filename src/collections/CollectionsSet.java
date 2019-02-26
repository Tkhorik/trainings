package collections;


import java.util.*;

public class CollectionsSet {
    public static void main(String[] args) {
        Set<Integer> myIntegersHeshsetSet = new HashSet<>();
        Set<Integer> myLikedHashSet = new LinkedHashSet<>();
        Set<Integer> myTreeHashSet = new TreeSet<>();

        myIntegersHeshsetSet.add(3);
        myIntegersHeshsetSet.add(2);
        myIntegersHeshsetSet.add(3);

        myLikedHashSet.add(5);
        myLikedHashSet.add(8);
        myLikedHashSet.add(5);

        myTreeHashSet.add(3);
        myTreeHashSet.add(9);
        myTreeHashSet.add(3);


        System.out.println("HashSet вернет хаотично");
        myIntegersHeshsetSet.forEach(System.out::println);
        System.out.println("LinkedHashSet вернет в порядке первоначального добавления");
        myLikedHashSet.forEach(System.out::println);
        System.out.println("TreeSet вернет в natural order");
        myTreeHashSet.forEach(System.out::println);

    }
}