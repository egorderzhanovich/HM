package mayFifth.concurrency;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JewelryStore jw = new JewelryStore();

        for (int i = 0; i < new Random().nextInt(20) + 1; i++) {
            new Thread(new Clients(jw)).start();
        }
    }
}
