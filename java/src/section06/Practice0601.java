package section06;

import java.util.Scanner;

public class Practice0601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        while (true) {
            System.out.print("숫자를 입력하세요 (종료: 0): ");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("입력된 숫자들의 합: " + sum);
        scanner.close();
    }
}
