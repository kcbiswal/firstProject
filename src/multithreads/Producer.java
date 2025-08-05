package multithreads;

public class Producer extends Thread{
    Company c;
    Producer(Company c){

        this.c=c;

    }

    @Override
    public void run() {
        int i=1;
        while (i<5){
            c.produce_item(i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            i++;

        }
    }
}
