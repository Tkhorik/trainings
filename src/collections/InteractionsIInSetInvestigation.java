package collections;

import org.omg.CORBA.INTERNAL;

import java.util.HashSet;
import java.util.Set;

public class InteractionsIInSetInvestigation {
    public static void main(String[] args) {

        Set<Integer> myHeshSet1 = new HashSet<>();
        Set<Integer> myHeshSet2 = new HashSet<>();

        myHeshSet1.add(0);
        myHeshSet1.add(1);
        myHeshSet1.add(2);
        myHeshSet1.add(3);
        myHeshSet1.add(4);
        myHeshSet1.add(5);

        myHeshSet2.add(3);
        myHeshSet2.add(4);
        myHeshSet2.add(5);
        myHeshSet2.add(6);
        myHeshSet2.add(7);
        myHeshSet2.add(8);

        //union - объеденение
        Set<Integer> union = new HashSet<>(myHeshSet1);
        union.addAll(myHeshSet2);
        System.out.println("union " + union);

        System.out.println();
        //intersection - пересеечение
        Set<Integer> intersection = new HashSet<>(myHeshSet1);
        intersection.retainAll(myHeshSet2);
        System.out.println("intersection" + intersection);

        System.out.println();
        //difference - разность множества
        Set<Integer> difference = new HashSet<>(myHeshSet1);
        difference.removeAll(myHeshSet2);
        System.out.println("difference" + difference);
    }
}
