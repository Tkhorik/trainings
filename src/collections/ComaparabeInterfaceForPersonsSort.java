package collections;

import java.util.*;

public class ComaparabeInterfaceForPersonsSort {
    public static void main(String[] args) {


        List<PersonWithComparableInterface> personsList = new ArrayList<>();
        Set<PersonWithComparableInterface> personstreeSet = new TreeSet<>();
        addElementsIn(personsList);
        addElementsIn(personstreeSet);

        System.out.println(personstreeSet);
        System.out.println(personsList);

        for (PersonWithComparableInterface elem : personstreeSet) {
            System.out.println(elem);
        }
    }

    static void addElementsIn(Collection collection) {
        collection.add(new PersonWithComparableInterface(1, "qwe1"));
        collection.add(new PersonWithComparableInterface(2, "qw2"));
        collection.add(new PersonWithComparableInterface(3, "qwe3"));
    }
}

class PersonWithComparableInterface implements Comparable<PersonWithComparableInterface> {
    private int id;

    public PersonWithComparableInterface(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(PersonWithComparableInterface o) {
        if (this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "PersonWithComparableInterface{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
