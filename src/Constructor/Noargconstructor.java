package Constructor;

public class Noargconstructor {
    String name;
    Noargconstructor(){
        name="kanha";
        System.out.println("No-arg constructor called");

    }

    public static void main(String[] args) {
        Noargconstructor nac= new Noargconstructor();
        System.out.println("My name is "+nac.name);
    }
}
