package section05;

public class Ex0505 {
    public static void main(String[] args) {
        // 1~10 짝수 출력
        int number = 0;

        while (true) {
            number++;
            if (number%2 != 0) {
                continue;
            }
            System.out.println(number);
            if(number >= 10)
            break;
        }
    }
}
