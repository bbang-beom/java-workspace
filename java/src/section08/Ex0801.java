package section08;

public class Ex0801 {
    String owner;
    // method 종류
    // 1. 인수 x, 반환값 x -> void
    void onCalc() {
        System.out.println("계산기 전원이 켜졌습니다.");
    }

    // 2. 인수 x, 반환값 o
    double pi() {
        return 3.14;
    }

    // 3. 인수 o, 반환값 o
    int add(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }

    // 4. 인수 o, 반환값 x
    void offCalc(String name) {
        owner = name;
        System.out.println(owner + "님 안녕히 계세요.");
    }

    public static void main(String[] args) {
        Ex0801 cal = new Ex0801();
        cal.onCalc();

        double value = cal.pi();
        System.out.println(5 * 5 * value);

        int value2 = cal.add(1, 2, 3);
        System.out.println(value2);
        
        cal.offCalc("홍길동");
    }
}
