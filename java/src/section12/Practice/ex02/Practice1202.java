package section12.Practice.ex02;

interface Shape {
    double calculateArea();
    String getName();
}

class Cricle implements Shape {
    double radius;
    String name;

    
    Cricle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double width;
    double height;
    String name;

    Rectangle(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Triangle implements Shape {
    double width;
    double height;
    String name;

    Triangle(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return width * height * 0.5;
    }

}

public class Practice1202 {
    public static void main(String[] args) {
        Shape[] Shapes = {
                new Cricle(5.0, "원"),
                new Rectangle(4.0, 6.0, "직사각형"),
                new Triangle(4.0, 5.0, "삼각형")
        };

        for (Shape shape : Shapes) {
            System.out.printf("%s의 면적: %.2f\n", shape.getName(), shape.calculateArea());

        }
    }
}
