package section06;

import java.util.Scanner;

public class Practice0604 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dan = 0;

        while (true) {
            System.out.print("출력할 구구단의 단을 입력하세요(종료는 0): ");
            dan = scanner.nextInt();
            if(dan == 0){
            break;
            } else{
                for (int i = 1; i < 10; i++) {
                    System.out.printf("%d x %d = %-2d\n", dan, i, (dan * i));
                }
            }
        }
        scanner.close();
    }
}
