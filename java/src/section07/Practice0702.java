package section07;

public class Practice0702 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println("합은: " + sum);
    }
}
