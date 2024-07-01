package section02;

public class Variable {
    public static void main(String[] args) {
        // tip : 자동 들여쓰기 줄 맞춤 alt + shift + f
        // 자료형
        // 1) 기본 자료형(primitive type)
        // - 정수(3) : byte(1byte == 8bit), short(2byte), int(4), long(8)
        // - 실수(3.14) : float(4), double(8)
        // - 문자(a, b, c...) : char(2)
        // - boolean(참/거짓 : true/false)

        // 2) 참조 자료형(reference type)
        // - 문자열(abc) : String
        // - 배열
        // - 객체
        int a; // 변수(variable) 선언 : 변할 수 있는 수
               // 변수는 카멜케이스 표기법으로 생성
        a = 3; // a에 3을 할당(대입: assignment) -> 초기화
        System.out.println(a);

        int b = 5; // 변수 정의
        System.out.println(b); // sout + tab키 자동 완성

        a = 10;
        System.out.println(a);
    }
}
