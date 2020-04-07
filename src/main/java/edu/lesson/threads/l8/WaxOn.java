package edu.lesson.threads.l8;

import java.util.concurrent.TimeUnit;

public class WaxOn implements Runnable {
    private Car car;
    public WaxOn(Car c) {
        car = c;
    }
    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
//            if (!Thread.interrupted()) {
                System.out.println("Wax On! ");
//                TimeUnit.MILLISECONDS.sleep(200);
                car.waxed();
                TimeUnit.MILLISECONDS.sleep(200);
                car.waitForBuffing();
            }
        } catch (InterruptedException e) {
            System.out.println("Existing via interrupt");
        }
        System.out.println("Ending wax on task");
    }
}
