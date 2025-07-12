package Oops;

public class Main {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.colour="blue";
        p1.type= "gel";
       // p1.write();
        //create a second object for pen.
        Pen p2=new Pen();
        p2.colour="black";
        p2.type="ballpoint";
        p1.printColour();
        p2.printColour();
    }
}
