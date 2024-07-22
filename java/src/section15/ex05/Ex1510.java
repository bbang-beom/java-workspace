package section15.ex05;



public class Ex1510 {
    public static void main(String[] args) {
        int absValue = Math.abs(-10); // 절대값
        System.out.println("absValue: " + absValue);

        double powValue = Math.pow(2, 3); // 거듭제곱
        System.out.println("powValue" + powValue);

        double sqrValue = Math.sqrt(16); // 제곱근
        System.out.println("sqrValue: " + sqrValue);

        int maxValue = Math.max(10, 20); //최대값
        System.out.println("maxValue: " + maxValue);

        int minValue = Math.min(10, 20); //최소값
        System.out.println("minValue: " + minValue);

        double radians = Math.toRadians(30); // radian 값
        double sinValue = Math.sin(radians); // sin 값
        System.out.println("sinValue: " + sinValue);

        double logValue = Math.log(10); // 로그
        System.out.println("logValue: " + logValue);

    }
}
