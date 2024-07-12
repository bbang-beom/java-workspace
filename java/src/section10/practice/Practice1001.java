package section10.practice;

class Animal {
     void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
     void eat() {
        System.out.println("This dog eats food");
    }

    void bark() {
        System.out.println("The dog barks");
    }
}

public class Practice1001 {
    public static void main(String[] args) {
        Animal animalDog = new Dog();
        animalDog.eat();

        Dog dog = (Dog) animalDog; // 형변환
        dog.bark();
    }
}
