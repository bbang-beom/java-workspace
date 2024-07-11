package section10.finalexample;

class NomalClass {

}

class ChildNomalClass extends NomalClass {

}

// final class FinalClass { // final class 는 자식 class 생성불가

// }

// class ChildFinalClass extends FinalClass {

// }

public class Ex1003 {
    public static void main(String[] args) {

        ChildNomalClass cnc = new ChildNomalClass();
        System.out.println(cnc);
    }
}
