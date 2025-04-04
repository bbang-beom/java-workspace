package section12.Practice.ex01;

abstract class Shape {
    String name;

    abstract double calculateArea();
}

class Cricle extends Shape {
    double radius;

    Cricle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    double width;
    double height;

    Triangle(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    @Override
    double calculateArea() {
        return width * height * 0.5;
    }

}

public class Practice1201 {
    public static void main(String[] args) {
        Shape[] Shapes = {
                new Cricle(5.0, "원"),
                new Rectangle(4.0, 6.0, "직사각형"),
                new Triangle(4.0, 5.0, "삼각형")
        };

        for (Shape shape : Shapes) {
            System.out.printf("%s의 면적: %.2f\n", shape.name, shape.calculateArea());

        }
    }
}
