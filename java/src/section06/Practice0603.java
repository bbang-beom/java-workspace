package section06;

import java.util.Scanner;

public class Practice0603 {
    public static void main(String[] args) {
        // 1부터 10까지의 홀수의 합: 25
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int start = 0;
        int end = 0;
        int number = 0;
        String isOdd = null;

        System.out.print("시작하는 숫자와 마지막 숫자를 입력하세요.(스페이스로 구분): ");
        start = scanner.nextInt();
        end = scanner.nextInt();
        System.out.print("홀수는 1, 짝수는 2를 입력하세요: ");
        number = scanner.nextInt();
        if (number == 1) {
            for (int i = start; i < end+1; i++) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }
        } else if (number == 2) {
            for (int i = start; i < end+1; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        isOdd = number == 1 ? "홀수" : "짝수";
        System.out.printf("%d부터 %d까지 %s의 합: %d\n",start, end, isOdd, sum);
        
        scanner.close();
    }
}
