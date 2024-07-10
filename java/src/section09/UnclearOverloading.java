package section09;

public class UnclearOverloading {
    String s;
    int a;
    int b;

    UnclearOverloading() {
        this.s = "java";
        this.a = 1;
        this.b = 2;
    }

    UnclearOverloading(String s, int a, int b) {
        this.s = s;
        this.a = a;
        this.b = b;
    }

    // UnclearOverloading(String s, int b, int a) { 
    // java는 애매한 상황을 허락하지 않는다 
    // 위의 매개변수에서 int끼리만 순서를 바꾸는 overloading은 허락X
    //     this.s = s;
    //     this.a = a;
    //     this.b = b;
    // }

    void printfield(){
        System.out.printf("s = %s, a = %d, b = %d\n", s, a, b);
    }
}
