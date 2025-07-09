package Constructor;

public class Parameterizedconstructor {
    String name;
    int age;
    Parameterizedconstructor(String name,int age){
        this.name=name;
        this.age=age;


    }
    public  void disply(){
        System.out.println("my name is "+name+ "age is "+age);
    }

    public static void main(String[] args) {
        Parameterizedconstructor pmc=new Parameterizedconstructor("kanha",27);
        pmc.disply();

    }
}
