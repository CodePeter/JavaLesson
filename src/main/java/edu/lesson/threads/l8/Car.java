package edu.lesson.threads.l8;

public class Car {
    private boolean waxOn = false;
    public synchronized void waxed() {
        waxOn = true;
        notifyAll();
    }
    public synchronized void buffed() {
        waxOn = false;
        notifyAll();
    }
    public synchronized void waifForWaxing() throws InterruptedException {
//        while (waxOn == false)
        if (waxOn == false)
            wait();
    }
    public synchronized void waitForBuffing() throws InterruptedException {
//        while (waxOn == true)
        if (waxOn == true)
            wait();

    }

}
