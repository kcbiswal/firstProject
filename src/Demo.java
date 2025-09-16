import Variables.Test;
import collections.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {


        List<Student> list=new ArrayList<>();

        list.add(new Student(1,"kanha"));
        list.add(new Student(2,"rama"));
        list.add(new Student(3,"hari"));
        list.add(new Student(4,"amit"));


        list.forEach(new Test());
    }
}
