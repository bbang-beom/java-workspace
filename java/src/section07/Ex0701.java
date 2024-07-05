package section07;

public class Ex0701 {
    public static void main(String[] args) {
        int[] oddArr = {1, 3, 5, 7, 9}; // 대체적으로 사용하는 방법
        
        System.out.println("oddArr\t\t" + oddArr);
        
        /*
         * [: 배열
         * I: 정수형(int)
         * @
         * 5ca881b5: 배열 객체 해시코드(16진수 표현)
         */
        System.out.println("oddArr.length\t: " + oddArr.length);
        for (int i = 0; i < oddArr.length; i++) {
            System.out.printf("%d ", oddArr[i]);
        }
    }
}
