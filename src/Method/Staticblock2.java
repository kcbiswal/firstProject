package Method;

public class Staticblock2 {
    static  int number;
    static{
        number=100;
        System.out.println("static block excuted number initializing to " + number);
    }

    public static void main(String[] args) {
        System.out.println("main method executed");
        System.out.println(number);
    }
}
