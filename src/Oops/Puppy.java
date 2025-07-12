package Oops;

public class Puppy extends Dog{
    void weep(){
        System.out.println("This puppy weeps");
    }

    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
