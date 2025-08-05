package collections;

import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        Stack s=new Stack<>();
        s.push(10);
        s.push("kanha");
        s.push(20);
        s.push("biswal");
        System.out.println(s.peek());//top  element
        s.pop();//remove the top element
        System.out.println(s);
    }
}
