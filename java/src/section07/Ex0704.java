package section07;

import java.util.Arrays;
import java.util.Collections;

public class Ex0704 {
    public static void main(String[] args) {
        int[] numbers = {30, 10, 50, 20, 40};
       
        System.out.println("정렬 전 : " + Arrays.toString(numbers));

        Arrays.sort(numbers); // 오름차순 정렬

        System.out.println("정렬 후 : " + Arrays.toString(numbers));

        // wrapper
        Integer[] intergerNumbers = {30, 10, 50, 20, 40};
        Arrays.sort(intergerNumbers, Collections.reverseOrder()); // 내림차순 정렬

        System.out.println("intergerNumbers 정렬 후 : " + Arrays.toString(intergerNumbers));
    }
}
