package multithreads;

public class Company {
    int n;
    boolean f=false;
    synchronized public void produce_item(int n){
        if (f){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n=n;
        System.out.println("produced; "+this.n);
        f=true;
        notify();

    }
   synchronized public int consume_item(){
        if (!f){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("consumed : "+this.n);
        f=false;
        notify();
        return this.n;

    }
}
