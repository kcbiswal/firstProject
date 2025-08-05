package multithreads;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("value of i: " +i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        Thread thr=new Thread(t1);
        //this is  my another thread
        MyAnotherThread t2=new MyAnotherThread();
        thr.start();
        t2.start();
    }
}
