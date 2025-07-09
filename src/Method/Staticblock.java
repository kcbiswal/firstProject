package Method;

public class Staticblock {
    static{
        System.out.println("static block excuted first");

    }
    //we can create multiple static block in a class.
    static{
        System.out.println("i am the second static method");
    }

    public static void main(String[] args) {
        System.out.println("i am in the main method");

    }
}
