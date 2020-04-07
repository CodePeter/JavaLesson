package edu.lesson.threads.l5;


public class PairManipulator implements Runnable {
    private PairManager pm;
    public PairManipulator(PairManager pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) pm.increment();
    }
    public String toString() {
        pm.getStorage().stream().forEach(
                e -> System.out.println(e.toString()));
        return "Pair: "+pm.getPair()+" checkCounter = "+pm.checkCounter.get()+" list size: "+pm.getStorage().size()
                ;
    }
}
