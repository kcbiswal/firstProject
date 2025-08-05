package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {
    public static void main(String[] args) {

        HashSet<Student>hs=new HashSet<>();
        hs.add(new Student(100,"shiva"));
        hs.add(new Student(101,"hari"));
        hs.add(new Student(102,"rama"));
        hs.add(new Student(103,"krishna"));
        Iterator<Student>iterator= hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
