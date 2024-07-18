package section14.ex05;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    private String message;
    public InvalidAgeException (String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "접근 불가: " + this.message;
    }
}

public class Ex1408 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이를 입력하세요: ");
        int age = scanner.nextInt();

        try {
            if (age < 19) {
                throw new InvalidAgeException("미성년자");
            } else {
                System.out.println("허가");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
