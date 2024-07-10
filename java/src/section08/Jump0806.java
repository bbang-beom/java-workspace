package section08;

public class Jump0806 {
    public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();

    c1.setName("갤럭시");
    c2.setName("아이폰");
    

 
    Counter.setCount();
    Counter.setCount();
    Counter.setCount();

    System.out.println(c1.disPlayName + "=" + Counter.count);
    System.out.println(c2.disPlayName + "=" + Counter.count);
    
    
    }
}
