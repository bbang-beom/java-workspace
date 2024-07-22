package section15.ex07;

import java.sql.Time;
import java.util.Calendar;

public class Ex1514 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // Calendar 생성
        System.out.println(calendar.get(Calendar.YEAR)); // 호출
        System.out.println(calendar.get((Calendar.MONTH))); 
        System.out.println(calendar.get((Calendar.DAY_OF_MONTH))); 
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        int month = calendar.get(Calendar.MONTH);
        switch (month) {
            case Calendar.JULY:
                System.out.println("7월");
                break;

            case Calendar.AUGUST:
                System.out.println("8월");
                break;
            case Calendar.SEPTEMBER:
                System.out.println("9월");
                break;
        
            default:
                break;
        }
        int ampm = calendar.get(Calendar.AM_PM);
        if (ampm == 1) {
            System.out.println("오후");
        } else {
            System.out.println("오전");
        }
    }
}
