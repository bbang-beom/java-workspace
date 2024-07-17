package section12.ex03;

abstract class Vehicle {
    abstract void start();

    abstract void stop();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("car is starting");
    }

    @Override
    void stop() {
        System.out.println("car is stopping");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }

    @Override
    void stop() {
        System.out.println("Bike is stopping");
    }

}

public class Ex1203 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myBike.start();

        myCar.stop();
        myBike.stop();
    }
}
