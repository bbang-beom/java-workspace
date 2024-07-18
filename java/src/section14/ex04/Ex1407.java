package section14.ex04;

import java.util.Scanner;

public class Ex1407 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이를 입력하세요: ");
        int age = scanner.nextInt();

        try {
           checkAge(age);
        } catch (Exception e) {
            System.out.println("접근불가");
        } finally {
            scanner.close();
        }
    }

        static void checkAge(int age) throws Exception{
            if (age < 19) {
                throw new Exception("미성년자");
            } else {
                System.out.println("허가");
            }
        }
    }

