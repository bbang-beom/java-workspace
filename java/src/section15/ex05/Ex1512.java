package section15.ex05;

public class Ex1512 {
    public static void main(String[] args) {

            double num = Math.random(); // random은 double 값 0.0이상 1미만 random
            num *= 10;
            System.out.println(num);

            int intNum = (int) num;
            System.out.println(intNum);
            
            intNum = (int) (Math.random() *100 + 1);
            System.out.println(intNum);
    }
}
