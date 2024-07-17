package section12.Practice.ex03;

interface Machine {
    void start();
    void stop();
}

interface Drivable {
    void drive();
}

interface Flyable {
    void fly();
}

interface FlyingMachine extends Machine, Drivable, Flyable {

}

class FlyingCar implements FlyingMachine {
    @Override
    public void drive() {
        System.out.println("My Car is driving");
    }

    @Override
    public void fly() {
        System.out.println("My Car is flying");
    }

    @Override
    public void start() {
        System.out.println("Flying in the sky");
    }

    @Override
    public void stop() {
        System.out.println("Stop now");
    }
}

public class Practice1203 {
    public static void main(String[] args) {
        FlyingCar myFlyingCar = new FlyingCar();
        myFlyingCar.drive();
        myFlyingCar.fly();
        myFlyingCar.start();
        myFlyingCar.stop();
    }
}
