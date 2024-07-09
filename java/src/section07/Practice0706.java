package section07;

public class Practice0706 {
    public static void main(String[] args) {
        int [][] numbers =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.printf("%d ", numbers[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int[] number : numbers) {
            for (int num : number) {
                 System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }
}
