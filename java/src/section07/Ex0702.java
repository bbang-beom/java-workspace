package section07;

import java.util.Arrays;

public class Ex0702 {
    public static void main(String[] args) {
        int[] oddArrObject;
        // oddArrObject = {1, 3, 5, 7, 9}; -> literal를 따로 입력하는 방식으로는 초기화 불가
        oddArrObject = new int[] {1, 3, 5, 7, 9};
        //toString -> Arrays 변수를 문자열 형태로 출력
        System.out.println(Arrays.toString(oddArrObject));

        int[] intArr = new int[5]; // 정수는 0, 실수는 0.0, 문자는 "", 객체는 null로 초기화
        System.out.println("before - Arrays.toString(intArr)\t: " + Arrays.toString(intArr));

        intArr[0] = 1;
        intArr[1] = 1;
        intArr[2] = 1;
        intArr[3] = 1;
        intArr[4] = 1;
        System.out.println("after - Arrays.toString(intArr)\t\t: " + Arrays.toString(intArr));

        }
    }

