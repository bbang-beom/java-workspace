package section07;

public class Practice0704 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                max = numbers[i];
            }
        }

        System.out.println("배열의 최대값: " + max);
        System.out.println("배열의 최소값: " + min);
    }
}
