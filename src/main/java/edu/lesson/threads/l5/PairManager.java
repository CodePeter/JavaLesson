package edu.lesson.threads.l5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

abstract class PairManager {
    AtomicInteger checkCounter = new AtomicInteger(0);
    protected Pair p = new Pair();
//    private List<Pair> storage = Collections.synchronizedList(new ArrayList<>());
    private List<Pair> storage = new ArrayList<>();
//    public Pair getPair() {
//        return new Pair(p.getX(), p.getY());
//    }

    public List<Pair> getStorage() {
        return storage;
    }
    public synchronized Pair getPair() {
        return new Pair(p.getX(), p.getY());
    }
    protected void store(Pair p) {
        storage.add(p);
        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {

        }
    }
    public abstract void increment();
}
