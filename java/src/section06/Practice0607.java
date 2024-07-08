package section06;

import java.util.Scanner;

public class Practice0607 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.print("반복할 횟수를 입력하세요: ");
        number = scanner.nextInt();

        for (int i = number; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
