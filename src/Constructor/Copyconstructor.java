package Constructor;

public class Copyconstructor {
    String name;
    int age;
    Copyconstructor(String name,int age){//this is parameterized constructor.
        this.name=name;
        this.age=age;

    }
    Copyconstructor(Copyconstructor cc){
        this.name=cc.name;
        this.age= cc.age;

    }
    public void disply(){
        System.out.println("my name is  " +  name + " ,age is  "+age);
    }

    public static void main(String[] args) {
        Copyconstructor  cc1=new Copyconstructor("kanha",27);
        Copyconstructor cc2=new Copyconstructor(cc1);
        cc1.disply();
        cc2.disply();
    }

}
