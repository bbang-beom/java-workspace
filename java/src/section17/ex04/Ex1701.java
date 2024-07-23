package section17.ex04;

class Counter {
    private int count;

    public int getCount() {
        return this.count;
    }

    public synchronized void SetCount() {
        this.count++;
    }
}

class Sample extends Thread {
    private Counter counter;
    int seq;

    public Sample(int seq, Counter counter) {
        this.seq = seq;
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000); // 1초
                } catch (Exception e) {
                    e.printStackTrace();
                }
                counter.SetCount();
                System.out.println(this.seq + "thread add count: " + counter.getCount());
            }
        }
    }
}

public class Ex1701 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Sample sample1 = new Sample(1, counter);
        Sample sample2 = new Sample(2, counter);
        sample1.start();
        sample2.start();
    }
}
