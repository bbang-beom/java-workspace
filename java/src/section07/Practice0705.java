package section07;

import java.util.Scanner;

public class Practice0705 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = 0;
        int[] numbers = {10, 20, 30, 40, 50};
        boolean found = false;

        System.out.print("찾을 값을 입력하세요: ");
        target = scanner.nextInt();
        for (int i = 0; i < numbers.length; i++) {            
            if (target == numbers[i]) {
                found = true;
            }
        }
        if (found == true) {
            System.out.println("배열에 " + target + "이 존재합니다.");
        } else {
            System.out.println("배열에 " + target + "이 존재하지 않습니다.");
        }
        scanner.close();
    }
}
