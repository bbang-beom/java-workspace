package section13.ex03_local;

class OuterLocal {
    void display() {
        String localVariable = "Local Variable";

        class LocalInner {
            void show() {
                // localVariable = "new Local Variable"; // 지역 변수의 값 변경 불가
                System.out.println(localVariable);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.show();
    }
}

public class Ex1303 {
    public static void main(String[] args) {
        OuterLocal outer = new OuterLocal();
        outer.display();
    }
}
