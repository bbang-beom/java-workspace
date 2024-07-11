package section10.ifvsoverriding;

class Animal {
    void roar() {

    }
}

class Pig extends Animal {
    void roar() {
        System.out.println("꿀꿀");

    }
}

class Cow extends Animal {
    void roar() {
        System.out.println("음메");

    }
}

class Tiger extends Animal {
    void roar() {
        System.out.println("어흥");

    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("사자후");

    }
}

class Duck extends Animal {
    void roar() {
        System.out.println("꽥꽥");

    }
}

// 결합도 높다, 응집도 낮다
class Farm {
    void sound(Animal animal) {
        // if (animal instanceof Pig) {
        // System.out.println("꿀꿀");
        // }

        // if (animal instanceof Cow) {
        // System.out.println("음메");
        // }

        // if (animal instanceof Tiger) {
        // System.out.println("어흥");

        // if (animal instanceof Tiger) {
        // System.out.println("사자후");
        // }
        // }
        animal.roar();
    }
}

public class Ex1001 {
    public static void main(String[] args) {
        Farm f = new Farm();
        Pig p = new Pig();
        Cow c = new Cow();
        Tiger t = new Tiger();
        Lion l = new Lion();
        Duck d = new Duck();

        f.sound(p);
        f.sound(c);
        f.sound(t);
        f.sound(l);
        f.sound(d);
    }
}
