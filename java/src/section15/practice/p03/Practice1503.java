package section15.practice.p03;

import java.util.Arrays;

public class Practice1503 {
    public static void main(String[] args) {
        String str = "Hello World!";
        int length = str.length();

        System.out.println("length: " + length);

        String str1 = "Hello";
        String str2 = "Hello";

        if (str1.equals(str2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        String firstName = "일남";
        String lastName = "김";
        
        String fullName = lastName + firstName; 
        System.out.println(fullName);

        String str3 = "Hello, World!";
        String subStr3 = str3.substring(7, 12);
        System.out.println(subStr3);

        String str4 = "Hello, World!";
        String replaceStr4 = str4.replaceAll("o", "0");
        System.out.println(replaceStr4);

        String str5 = "Apple, Banana, Cherry";
        String[] splitStr5 = str5.split(",");
        System.out.println(Arrays.toString(splitStr5));

        String str6 = "   Hello World!   ";
        String trimmedStr6 = str6.trim();
        System.out.println(trimmedStr6);
    }
}
