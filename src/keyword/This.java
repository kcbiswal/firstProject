package keyword;

public class This {
    public static void main(String[] args) {

        Child c1=new Child(15,"Rajesh");
        Child c2=new Child(c1);
        System.out.println(c1.age);
        System.out.println(c2.age);

        System.out.println(c1.name);
        System.out.println(c2.name);




}}
