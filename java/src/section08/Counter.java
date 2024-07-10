package section08;

public class Counter {
    static int count = 0;
    String disPlayName;

    static void setCount() {
        count++;
    }

    void setName(String disPlayName){
        this.disPlayName = disPlayName;
    }
}
