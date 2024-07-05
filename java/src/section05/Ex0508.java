package section05;

public class Ex0508 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 1) 
                continue;
            
            System.out.printf("%d " , i);
        }
    }
}
