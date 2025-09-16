package keyword;

public class Child extends Parent{


int age;
String name;
Child child;

    public Child( int age,String name){
       this.age=age;
       this.name=name;

    }

    public  Child(Child c){
       this.age=c.age;
       this.name=c.name;
    }
}
