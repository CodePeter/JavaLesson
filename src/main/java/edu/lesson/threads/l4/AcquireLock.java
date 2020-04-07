package edu.lesson.threads.l4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AcquireLock {
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        final AcquireLock al = new AcquireLock();

    }
}
