package section06;

import java.util.Scanner;

public class Practice0605 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        String reversed = "";
        int length = 0;

        System.out.print("문자열을 입력하세요: ");
        input = scanner.nextLine();
        length = input.length();
        

        for (int i = 0; i < input.length(); i++) {
            reversed += input.charAt(length-(i+1));
        }
        System.out.printf("뒤집은 문자열: %s\n", reversed);
        scanner.close();
    }
}
