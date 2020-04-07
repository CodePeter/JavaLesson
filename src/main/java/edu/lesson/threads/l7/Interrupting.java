package edu.lesson.threads.l7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Interrupting {
    private static ExecutorService exec = Executors.newCachedThreadPool();
    static void test(Runnable r) throws InterruptedException {
        Future<?> f = exec.submit(r);
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("Interrupting "+r.getClass().getName());
        f.cancel(true);
        System.out.println("Interrupt sent to "+r.getClass().getName());
    }
    static void testThread(Runnable r) throws InterruptedException {
        Thread t = new Thread(r);
        t.start();
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("Interrupting "+r.getClass().getName());
//        Thread.currentThread().interrupt();
        t.interrupt();
        System.out.println("Interrupt sent to "+r.getClass().getName());
    }

    public static void main(String[] args) throws InterruptedException {
//        test(new SleepBlocked());
        testThread(new SleepBlocked());
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Aborting with System.exit(0)");
        System.exit(0);
    }
}
