package section06;

import java.util.Scanner;

public class Practice0602 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "java";
        String password = null;

        while (true) {
            System.out.print("비밀번호를 입력하세요: ");
            password = scanner.nextLine();
            if (password.equals(correctPassword)) {
                System.out.println("확인되었습니다");
                break;
            }
            System.out.println("잘못된 비밀번호입니다.");
        }
        scanner.close();
    }
}
