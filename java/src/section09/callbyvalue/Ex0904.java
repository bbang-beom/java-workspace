package section09.callbyvalue;

public class Ex0904 {
    static void modifyValue(int value) {
        value = 20; // modifyValue의 매개변수
        System.out.println("modifyValue() 메서드에서 변경된 value\t: " + value);
    }
    public static void main(String[] args) {
        int value = 10; //main method 안에 value
        System.out.println("modifyValue() 메서드 호출 전 value\t: " + value); // 10
        // 값에 의한 호출 (Call by Value)
        modifyValue(value);                                                  // 20
        System.out.println("modifyValue() 메서드 호출 후 value\t: " + value); // 10
    }
}
