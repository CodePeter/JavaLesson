package edu.lesson.threads.l8;

import java.util.concurrent.TimeUnit;

public class WaxOff implements Runnable {
    private Car car;
    public WaxOff(Car c) {
        car = c;
    }

    @Override
    public void run() {

            try {
                while (!Thread.interrupted()) {
//                if (!Thread.interrupted()) {
                    car.waifForWaxing();
                    System.out.println("Wax Off! ");
                    TimeUnit.MILLISECONDS.sleep(200);
                    car.buffed();
                }
            } catch (InterruptedException e) {
                System.out.println("Existing via interrupt");
            }
            System.out.println("Ending Wax Off task!");
        }


}
