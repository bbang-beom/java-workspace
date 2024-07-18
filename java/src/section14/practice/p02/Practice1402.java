package section14.practice.p02;

import java.util.Scanner;

public class Practice1402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("피제수를 입력하세요: ");
        int dividend = scanner.nextInt();
        System.out.println("제수를 입력하세요: ");
        int divisor = scanner.nextInt();
        try {    
            System.out.println("나눗셈 결과: " + (dividend / divisor));

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램 종료");
            scanner.close();
        }
    }
}
