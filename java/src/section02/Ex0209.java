package section02;

public class Ex0209 {
    public static void main(String[] args) {
        double doubleNum = 1.0e100;
        float floatNum = (float)doubleNum;
        
        System.out.println(floatNum);

       double doubleNum1 = 1.0e-100;
       float floatNum1 = (float)doubleNum1;
        
        System.out.println(floatNum1);

    }
}
