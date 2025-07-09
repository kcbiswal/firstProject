package Constructor;

public class Defaultconstructor {
    int id;
    String name;

    public static void main(String[] args) {
        Defaultconstructor dfc=new Defaultconstructor();
        //if we not initialize the value it will be by default null or 0.
        System.out.println("id  :"+dfc.id);
        System.out.println("name :"+dfc.name);
    }
}
