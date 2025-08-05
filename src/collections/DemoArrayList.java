package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add("kanha");
        al.add("amit");
        al.add(20.5);
//        System.out.println(al.size());
//        al.remove(0);
//        System.out.println(al.size());
//        System.out.println(al);
        //For loop approach
        for (int i=0;i< al.size();i++){
            System.out.println(al.get(i));
        }
        //For:Each loop Approach
        for (Object obj:al){
            System.out.println(obj);
        }
        //Iterator Approach
        Iterator iterator= al.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Listiterator Approach
        ListIterator listIterator= al.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        //Student class method
        ArrayList<Student>al2=new ArrayList<>();
        al2.add(new Student(1,"banty"));
        al2.add(new Student(2,"tusar"));
        al2.add(new Student(3,"rajesh"));
        al2.add(new Student(4,"lapu"));
        for (Student s:al2){
            System.out.println(s);
        }

       ListIterator<Student>li= al2.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }


}
}