package edu.lesson.threads.l2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class StaticNumberCheck {
    private static final int SIZE = 10;
    private static CircularSet serials = new CircularSet(1000);
    private static ExecutorService exec = Executors.newCachedThreadPool();

    static class SerialCheck implements Runnable {
        @Override
        public void run() {
            while (true) {
//               StaticlNumberGenerator gen =  new StaticlNumberGenerator();
                int serial = StaticlNumberGenerator.nextSerialNumber();
                if (serials.constains(serial)) {
                    System.out.println("Duplicate: "+serial);
                    System.exit(0);
                }
                serials.add(serial);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i=0; i<SIZE; i++) {
            exec.execute(new SerialCheck());
        }
        TimeUnit.SECONDS.sleep(10);
        System.out.println("No duplicates detected");
        System.exit(0);
    }
}
