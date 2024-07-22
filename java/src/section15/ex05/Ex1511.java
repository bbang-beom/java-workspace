package section15.ex05;

public class Ex1511 {
    public static void main(String[] args) {
        double pi = 3.14159265358979;

        System.out.println(Math.round(pi)); // 첫번째 소수점 반올림
        System.out.println(Math.round(pi * 10) / 10.0); // 두번째 소수점 반올림
        System.out.println(Math.round(pi * 100) / 100.0); // 세번째 소수점 반올림
        System.out.println();

        System.out.println(Math.ceil(pi)); // 첫번째 소수점 올림
        System.out.println(Math.ceil(pi * 10) / 10.0); // 두번째 소수점 올림
        System.out.println(Math.ceil(pi * 100) / 100.0); // 세번째 소수점 올림
        System.out.println();

        System.out.println(Math.floor(pi)); // 첫번째 소수점 내림
        System.out.println(Math.floor(pi * 10) / 10.0); // 두번째 소수점 내림
        System.out.println(Math.floor(pi * 100) / 100.0); // 세번째 소수점 내림
        System.out.println();
    }
}
