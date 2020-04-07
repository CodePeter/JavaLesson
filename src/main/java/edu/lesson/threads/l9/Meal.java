package edu.lesson.threads.l9;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private boolean ok = false;
    private List<Meal> meals = new ArrayList<>(10);

    public synchronized void cook() {
//        if (ok==false)
//            System.out.println("cooking");
            ok = false;
        notifyAll();
    }

    public synchronized void waitForEat() throws InterruptedException {
            if (ok==false) {
//                System.out.println("waiting for eating");
                wait();
            }
    }

    public synchronized void eat() {
//        if (ok==true) {
        ok = true;
//            System.out.println("eating");
            notifyAll();
//        }

    }

    public synchronized void waitForCook() throws InterruptedException {
        if (ok==true) {
//            System.out.println("waiting for cooking");
            wait();
        }
    }

}
