package section02;

public class Practice0203 {
    // public static final double PI = 3.141592653589793; 로도 가능
    public static void main(String[] args) {
        // pi 상수로 변경
        final double PI = 3.141592653589793;
        double radius = 5.0;

        double circumference = 2 * radius * PI;

        System.out.println("원의 둘레: " + circumference);

    }
}
