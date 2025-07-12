package Oops;

public class Polymorphism {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);

    }
    public  void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        Polymorphism pm=new Polymorphism();
        pm.name="kanha";
        pm.age=27;
        pm.printInfo(pm.name, pm.age);
    }
}
