package section14.ex02;

public class Ex1402 {
    public static void main(String[] args) {
        String numberString = "123abc"; // NumberFormatException

        int number = Integer.parseInt(numberString); // 문자열을 정수로
        System.out.println(number);
    }
}
