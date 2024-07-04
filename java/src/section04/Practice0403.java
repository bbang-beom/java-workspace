package section04;

import java.util.Scanner;

public class Practice0403 {
    public static void main(String[] args) {
        // int score = 85;

        // if (score >= 90) {
        // System.out.println("90점 이상 A학점");
        // } else if (score >= 80) {
        // System.out.println("80점 이상 B학점");
        // } else if (score >= 70) {
        // System.out.println("70점 이상 C학점");
        // } else if (score >= 60) {
        // System.out.println("60점 이상 D학점");
        // } else {
        // System.out.println("60점 미만 F학점");
        // }

        // switch (score/10) {
        // case 9:
        // System.out.println("90점 이상 A학점");
        // break;
        // case 8:
        // System.out.println("80점 이상 B학점");
        // break;
        // case 7:
        // System.out.println("70점 이상 B학점");
        // break;
        // case 6:
        // System.out.println("60점 이상 B학점");
        // break;
        // default:
        // System.out.println("60점 미만 F학점");
        // break;
        // }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("학점을 입력하세요: ");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("90점 이상 A학점");
        } else if (score >= 80) {
            System.out.println("80점 이상 B학점");
        } else if (score >= 70) {
            System.out.println("70점 이상 C학점");
        } else if (score >= 60) {
            System.out.println("60점 이상 D학점");
        } else {
            System.out.println("60점 미만 F학점");
        }
        scanner.close();
    }
}
