package section03;

public class Ex0308 {
    public static void main(String[] args) {
        int num = 2;

        System.out.println("num\t\t: " + num);
        System.out.println("num = num + num\t: " + (num = num + num));

        num = 2;
        // 복합 대입 연산자
        System.out.println("num += num\t: " + (num += num));
       
        num = 2;
        System.out.println("num = num * num\t: " + (num = num * num));
        
        num = 2;
        System.out.println("num *= num\t: " + (num *= num));

    }
}
