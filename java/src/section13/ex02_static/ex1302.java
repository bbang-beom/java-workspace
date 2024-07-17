package section13.ex02_static;

class OuterStatic {
    private String outerInstanceField = "outer instance field";
    static private String outerStaticField = "outer static field";

    static class InnerStatic {
        String innerInstanceField = "inner instance field";
        static String innerStaticField = "inner static field";

        void displayInstance() {
            // System.out.println(outerInstanceField); // 내부 static class의 경우 외부 class의 instance 접근 불가
            System.out.println(outerStaticField); // static instance는 접근 가능
        }
    }
}

public class ex1302 {
    public static void main(String[] args) {
        OuterStatic.InnerStatic inner = new OuterStatic.InnerStatic();
        inner.displayInstance();
        System.out.println(inner.innerInstanceField);
        System.out.println(inner.innerStaticField); // 이처럼 객체를 생성하지않고
        System.out.println(OuterStatic.InnerStatic.innerStaticField); // 이처럼 바로 접근 가능
    }
}
