package mayFifth.concurrency;

import java.util.Random;

public class Clients implements Runnable{
    JewelryStore store;

    Clients(JewelryStore store){
        this.store = store;
    }

    @Override
    public void run() {

            while(true) {
                store.clientIn();
                try {
                    Thread.sleep(new Random().nextInt(8000) + 1000);
                    store.clientOut();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
