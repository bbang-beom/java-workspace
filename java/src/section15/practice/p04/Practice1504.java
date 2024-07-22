package section15.practice.p04;

import java.util.Scanner;

public class Practice1504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = (int) (Math.random() * 10 + 1);
        int count = 0;

        while (true) {
            count++;
            System.out.print("1~10 정수를 입력하세요: ");
            int usrNum = scanner.nextInt();
            if (usrNum == target) {
                System.out.println("정답");
                break;
            }else if (usrNum > target) {
                System.out.println("down");
            }else if (usrNum < target) {
                System.out.println("up");
            }           
        }
        System.out.println(count + "번 만에 맞췄습니다.");
        scanner.close();
    }
}
