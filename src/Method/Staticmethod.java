package Method;

public class Staticmethod {
    static void display(){
        System.out.println("this is a static method");

    }

    public static void main(String[] args) {
        //we can call a static method without creating an object.
        display();
        //we can call static method to a class name in another class.
        Anothermethod.show();
    }
}
class Anothermethod{
    static void show(){
        System.out.println("this is also static method");

    }
}

