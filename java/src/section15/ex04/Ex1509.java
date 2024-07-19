package section15.ex04;

import java.util.Arrays;

public class Ex1509 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        // 문자열 길이
        int length = str1.length();
        System.out.println("Length of st1 = " + length);

        int length2 = str2.length();
        System.out.println("Length of st2 = " + length2);

        // 문자 접근
        char firstChar = str1.charAt(0);
        System.out.println("firstChar: " + firstChar);

        char lastChar= str1.charAt(length-1);
        System.out.println("lastChar" + lastChar);

        int index1 = str1.indexOf("World");
        System.out.println("str1.indexof(world): " + index1);
        
        int index2 = str1.indexOf("o");
        System.out.println("str1.indexof(o): " + index2);

        int index3 = str1.indexOf("o", 5);
        System.out.println("str1.indexof(o): " + index3);

        int index4 = str1.indexOf("O", 5);
        System.out.println("str1.indexof(o): " + index4);

        // 문자열 포함
        boolean contains1 = str1.contains("World");
        System.out.println("contains1: " + contains1);

        // 문자열 교체
        String replaceStr1 = str1.replaceAll("World", "Java");
        System.out.println("replaceStr1: " + replaceStr1);

        replaceStr1 += " " + replaceStr1;

        String replaceStr2 = replaceStr1.replaceAll("Java", "World");
        System.out.println("replaceStr2: " + replaceStr2);

        // 부분 문자열 추출
        String subStr = str2.substring(5, str2.length()-4);
        System.out.println("subStr: " + subStr);

        String subStr1 = str2.substring(5);
        System.out.println("subStr1: " + subStr1);

        // 문자열 비교
        String str3 = new String(str1);
        boolean isequal = str1.equals(str3);
        System.out.println("isequal: " + isequal);
        System.out.println("str1 == str3: " + (str1 == str3));

        // 대소문자 변환
        System.out.println("str2.toUpperCase(): " + str2.toUpperCase());
        System.out.println("str2.toLowerCase(): " + str2.toLowerCase());

        // 문자열 배열 반환
        String[] str2Arr = str2.split(" ");
        System.out.println("str2.split: " + Arrays.toString(str2Arr));

        // 배열을 문자열로 반환
        String str2ArrJoin = String.join("-", str2Arr);
        System.out.println("str2join: " + str2ArrJoin);
    }
}
