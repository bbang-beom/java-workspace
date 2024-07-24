package section19;

import java.util.Arrays;

public class Ex1901 {

    static int[] gugu(int dan) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = dan * (i+1);
        }
        return result;
    }
    public static void main(String[] args) {
        int dan = 2;
        int[] result = gugu(dan);
        System.out.println(Arrays.toString(result));

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, result[i-1]);
        }
    }
}
