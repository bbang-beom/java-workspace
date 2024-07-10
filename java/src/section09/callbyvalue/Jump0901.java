package section09.callbyvalue;


class Updater {
    void updater(int count){
        count++;
        System.out.println("update - myCounter.count\t: " + count);

    }
}

class Counter {
    int count = 0;
}


public class Jump0901 {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before - myCounter.count\t: " + myCounter.count);

        Updater myUpdater = new Updater();
        myUpdater.updater(myCounter.count);
        System.out.println("after - myCounter.count\t\t: " + myCounter.count);
    }
}
