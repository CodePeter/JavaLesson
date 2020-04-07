package edu.lesson.threads.l3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;
    private Lock lock = new ReentrantLock();
    @Override
    public int next() {
        lock.lock();
        try {
            ++currentEvenValue;
            Thread.yield();
            ++currentEvenValue;
        } finally {
            lock.unlock();
        }

        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new LockEvenGenerator());
    }
}
