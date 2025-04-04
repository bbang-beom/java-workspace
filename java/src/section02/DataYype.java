package section02;

public class DataYype {
    public static void main(String[] args) {
        // 정수
        int age = 10;
        System.out.println("제 나이는 " + age + "세 입니다.");

         age = 2147483647 + 1000;
        System.out.println("제 나이는 " + age + "세 입니다.");

        long num = 2147483647L + 1000L; //대문자 L 권장
        System.out.println(num);

        // 실수
        float pi = 3.14f; // float 형은 값(리터럴: literal) 뒤에 f
        System.out.println("float: " + pi);

        double height = 185.9;
        System.out.println("double: " + height);

        float overflow = 3.14159265359f; 
        System.out.println("float_overflow: " + overflow);

        //더 정밀한 실수 값은 double 사용
       double overflowDouble = 3.14159265359; 
        System.out.println("double_overflow: " + overflowDouble);

        // 8진수
        int octal = 023; // 값 앞에 0 사용
        System.out.println("8진수 23: " + octal);

        // 16진수
        int hex = 0x23;
        System.out.println("16진수 23: " + hex);

        // 문자(char)
        char c = 'c';
        System.out.println(c);
        c = 100;
        System.out.println(c);

        // 불리언(boolean)
        boolean b = true;
        System.out.println(b);
        b = false;
        System.out.println(b);
        b = 1 > 2; // false
        System.out.println(b);
        b = 1 < 2; // true
        System.out.println(b);
    }
}
