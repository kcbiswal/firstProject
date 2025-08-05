package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
        lhs.add(500);
        lhs.add(600);
        lhs.add(700);
        lhs.add(800);
        lhs.add(600);
        lhs.add(null);
        System.out.println(lhs);
    }
}
//Note->HashSet will not be maintain insertion order where as linkedHashSet will maintain insertion order
//HashSet will follow hashTable data structure where as LinkedHasSet will follow HashTable+DoubleLinkedlist data structure