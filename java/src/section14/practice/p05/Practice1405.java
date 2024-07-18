package section14.practice.p05;

import java.util.Scanner;

    class AgeException extends Exception{
    private String message;
    public AgeException (String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "에러발생: " + this.message;
    }
}

public class Practice1405 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이를 입력하세요: ");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void checkAge(int age) throws Exception {
        if (age < 0) {
            throw new AgeException("음수 입력 불가");
        } else {
            System.out.println("나이는 " + age);
        }
    }
}
