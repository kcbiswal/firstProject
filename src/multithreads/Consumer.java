package multithreads;

public class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true){

            c.consume_item();
          try {
              Thread.sleep(3000);
          }catch (Exception e){

          }
        }
    }
}

