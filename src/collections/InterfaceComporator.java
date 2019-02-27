package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfaceComporator {
    public static void main(String[] args) {
        List<String> newListForComparison = new ArrayList<>();

        newListForComparison.add("Mashaaa");
        newListForComparison.add("Olea");
        newListForComparison.add("Dassssssha");
        newListForComparison.add("Saaasha");
        Collections.sort(newListForComparison, new StringLenghtComparator());
        System.out.println(newListForComparison);
    }
}

class StringLenghtComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}