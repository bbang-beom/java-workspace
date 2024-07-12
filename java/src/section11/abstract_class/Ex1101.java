package section11.abstract_class;

abstract class Animal { // 추상 method가 하나라도 있으면 그 class는 반드시 추상 class여야함
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(this.name + " 냠냠");
    }

     abstract void makeSound();  // 추상 method 정의 
}

class Dog extends Animal{

    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(this.name + " 멍멍");
    }
}

public class Ex1101 {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // 추상 class는 객체 생성 불가
        Dog dog = new Dog("happy");
        dog.makeSound();
        dog.eat();
    }
}
