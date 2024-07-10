package section08;

public class Jump0805 {
    public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();

    
    System.out.println("c1.count: " + Counter.count);
    System.out.println("c2.count: " + Counter.count);
    System.out.println("Counter.count: " + Counter.count);

    System.out.println("------");
    Counter.setCount();
    Counter.setCount();

    System.out.println("c1.count: " + Counter.count);
    System.out.println("c2.count: " + Counter.count);
    System.out.println("Counter.count: " + Counter.count);
    }
}
