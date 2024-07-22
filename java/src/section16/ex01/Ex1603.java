package section16.ex01;

class NumberBox<T extends Number> { // generic에서 숫자만 생성가능(Integer, Double ..)
    private T item;

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class Ex1603 {
    public static void main(String[] args) {
        NumberBox<Integer> intBox1 = new NumberBox<>();
        intBox1.setItem(10);
        System.out.println(intBox1.getItem());

        // NumberBox<String> intBox2 = new NumberBox<>(); // 생성불가
        // intBox2.setItem("20");
        // System.out.println(intBox2.getItem());

        // System.out.println(intBox1.getItem() + intBox2.getItem());
    }
}
