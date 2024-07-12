package section10.ex05;

public class Dog extends Animal{ // 부모 class Animal이 생성자를 가지고 있으므로 생성자 반드시 필요
    Dog(String name) {
        super(name);
    }
    void sleep() {
        System.out.println("zzz");
    }
}
