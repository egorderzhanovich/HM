package mayFifth.concurrency;

import java.util.Random;

public class JewelryStore {
    private final int maxClientsCapacity = 5;
    private int clients = 0;

    public  void  lunch(){
        if (clients < 4){

            System.out.println("Store is closed");
            try{
               Thread.sleep(10000);
            }catch (InterruptedException ex){
                ex.getMessage();
            }
        }
    }
    public synchronized void clientIn(){
        while(clients > maxClientsCapacity){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            clients++;
            System.out.println("Client enter Store");
            notify();
    }

    public synchronized void clientOut() {
        while (clients <= 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        clients--;
        System.out.println("Client leaves Store");
        lunch();
        notify();
    }

    }

