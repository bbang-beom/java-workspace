package section10.casting;

class Animal {

}

class Dog extends Animal {

}

class HouseDog extends Dog {

}

class Cat extends Animal {

}

class HouseCat extends Cat {

}

public class Ex1005 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal ad = new Dog();
        Animal ahd = new HouseDog();
        Animal ac = new Cat();
        Animal ahc = new HouseCat();

        // Dog a1 = (Dog) a; // ClassCastException

        Dog ad1 = (Dog) ad; // 자식 타입으로 강제 형변환 (Animal ad = new Dog();)
        System.out.println(ad1);

        // HouseDog hd = (HouseDog) ad1; // ClassCastException

        HouseDog hd1 = (HouseDog) ahd;
        System.out.println(hd1); // 자식 타입으로 강제 형변환 (Animal ahd = new HouseDog();)

        Dog hd2 = (Dog) ahd;
        System.out.println(hd2);

        // Cat c1 = (Cat) ad; // ClassCastException Dog랑 Cat은 연관이 없음

        // 1. 자식 타입에서 부모 타입 형변환은 자동
        // 2. 부모 타입에서 자식 타입 형변환은 강제(조건: 자식타입에 부모 타입 형변환인 경우(1번일 경우))

    }
}
