package section02;

public class StringType {
    public static void main(String[] args) {
        String a = "Java";  // literal 할당
        String b = "Java";
        System.out.println(a);
        System.out.println("------");
        System.out.println(b);
        System.out.println(a == b); // ture

        // 값은 stack, 객체는 heap
        String c = new String("Java"); // 객체 생성
        System.out.println(c);
        System.out.println(a == c); 
        // false (값(literal) 과 객체를 비교하였기 때문에)
        System.out.println(a.equals(c));
    }
}
