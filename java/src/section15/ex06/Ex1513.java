package section15.ex06;

public class Ex1513 {
    public static void main(String[] args) {
        Integer intObject1 = Integer.valueOf(100);
        System.out.println(intObject1);

        Integer intObject2 = 200; // Autoboxing
        System.out.println(intObject2);

        Double doubleObject = 123.456;
        System.out.println(doubleObject);

        Character charObhect = 'A';
        System.out.println(charObhect);

        int intValue = intObject1; // AutoUnboxing
        System.out.println(intValue);

        double doubleValue = doubleObject;
        System.out.println(doubleValue);

        char charValue = charObhect;
        System.out.println(charValue);

        String strNumber = "200";
        int intNumber = Integer.parseInt(strNumber); // 문자열을 정수로
        System.out.println(intNumber + intNumber);

        double doubleNumber = Double.parseDouble(strNumber); // 문자열을 실수로
        System.out.println(doubleNumber + doubleNumber);

        String doubleString = Double.toString(doubleNumber); // 실수를 문자열로
        System.out.println(doubleString + doubleString);

        String doubleObjectString = Double.toString(doubleObject);
        System.out.println(doubleObjectString + doubleObject);

        int maxInt = Integer.max(20, 30); // 최대값
        System.out.println("maxInt: " + maxInt);

        int minInt = Integer.max(20, 30); // 최소값
        System.out.println("minInt: " + minInt);

    }
}
