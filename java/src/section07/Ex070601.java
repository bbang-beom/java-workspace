package section07;

import java.util.Arrays;

public class Ex070601 {
    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4, 5 };
        int[] copiedArray = new int[originalArray.length];

        // 원하는 부분 만큼만 copy할 때 
        System.arraycopy(originalArray, 1, copiedArray, 0, 3);
        // (복사할 배열, 복사 시작할 index, 만들 배열, 만들 배열의 시작 index, 복사할 길이)

        // copiedArray[0] = 100;

        System.out.println("origijnalArray\t: " + Arrays.toString(originalArray));
        System.out.println("copiedArray\t: " + Arrays.toString(copiedArray));
    }
}
