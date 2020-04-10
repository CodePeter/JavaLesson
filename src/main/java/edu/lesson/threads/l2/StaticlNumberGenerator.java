package edu.lesson.threads.l2;

public class StaticlNumberGenerator {
    private static int serialNumber = 0;
//    private final int nextSerialNumber = serialNumber++;

//    public synchronized int getNextSerialNumber() {
//        return nextSerialNumber;
//    }

        public static synchronized int nextSerialNumber() {return serialNumber++;}
    public static void main(String[] args) {
        StaticlNumberGenerator gen = new StaticlNumberGenerator();
//        gen.nextSerialNumber


    }

}
