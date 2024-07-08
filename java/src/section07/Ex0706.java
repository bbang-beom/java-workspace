package section07;

import java.util.Arrays;

public class Ex0706 {
    public static void main(String[] args) {
         int[] originalArray = {1, 2, 3, 4, 5};
        // int[] copiedArray = originalArray; 얕은 복사
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length); // 깊은 복사

        copiedArray[0] = 100;

        System.out.println("origijnalArray\t: " + Arrays.toString(originalArray));
        System.out.println("copiedArray\t: " + Arrays.toString(copiedArray));
    }
}
