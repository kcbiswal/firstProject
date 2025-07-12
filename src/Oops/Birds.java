package Oops;

abstract class Birds {
    abstract void fly();


}
class Eagle extends Birds{
    public void fly(){
        System.out.println("Eagles can fly at impressive heights");
    }
}
class Peacock extends Birds{
    public void fly(){
        System.out.println("peacock fly only for short distance");

    }

}
  class Oops{
public static void main(String[] args) {
    Eagle eagle=new Eagle();
    Peacock peacock= new Peacock();
    peacock.fly();
    eagle.fly();
}
}
