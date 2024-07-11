package section10.finalexample;

class NomalMethod {
    void NomalMethod() {
        System.out.println("nomalMethod");
    }
}

class ChildNomalMethod extends NomalMethod {
    @Override
    void NomalMethod() {
        System.out.println("ChildNomalMethod.NomalMethod");
    }
}

 class FinalMethod { // final method 는 overriding 불가
    final void finalMethod() {
        System.out.println("nomalMethod");
    }
}

//  class ChildFinalClass extends FinalMethod {
//     @Override
//     void finalMethod() {
//         System.out.println("ChildNomalMethod.NomalMethod");
//     }
//  }

public class Ex1004 {
    public static void main(String[] args) {
        ChildNomalMethod cnm = new ChildNomalMethod();
        cnm.NomalMethod();
    }
}
