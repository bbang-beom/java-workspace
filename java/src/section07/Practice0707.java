package section07;

public class Practice0707 {
    public static void main(String[] args) {
        int [][] numbers =  {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int sum= 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("for - 배열의 모든 요소의 합: " + sum);
        System.out.println();

        sum = 0;
        for (int[] number : numbers) {
            for (int num : number) {
                sum += num;
            }
        }
        System.out.println("for - 배열의 모든 요소의 합: " + sum);
    }
}
