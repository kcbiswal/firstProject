package multithreads;

public class ThreadOp {
    public static void main(String[] args) {
        int x=50+40;
        System.out.println("sum is "+x);
        //Thread
        Thread t=Thread.currentThread();
        String tname=t.getName();
        //set Thread
        t.setName("kanha thread");
        System.out.println(t.getName());
        System.out.println("the thread name is "+tname);

    }
}
