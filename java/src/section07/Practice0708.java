package section07;

import java.util.Scanner;

public class Practice0708 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][]arrs = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        int target = 0;
        int foundI = 0;
        int foundJ = 0;
        boolean found = false;

        System.out.print("검색할 값을 입력하세요: ");
        target = scanner.nextInt();

        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs.length; j++) {
                if (target == arrs[i][j]) {
                    found = true;
                    foundI = i;
                    foundJ = j;
                }
            }
        }

        if (found == true) {
            System.out.println(target + "는 " + foundI + "행 " + foundJ + "열에 존재합니다");
        } else{
            System.out.println(target + "을 찾을 수 없습니다.");
        }
        
        scanner.close();
    }
}
