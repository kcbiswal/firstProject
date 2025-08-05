package multithreads;

public class ThreadExample extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("this is run method");
    }

    public static void main(String[] args) {
        ThreadExample t1=new ThreadExample();
//        t1.start();
    }
}
