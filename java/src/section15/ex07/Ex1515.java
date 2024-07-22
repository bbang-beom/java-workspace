package section15.ex07;

import java.util.Calendar;

public class Ex1515 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        
        // Date 객체
        System.out.println("Date Object: " + calendar.getTime());

        calendar.set(calendar.YEAR, 2025); // 년도,날짜 설정
        calendar.set(calendar.MONTH, Calendar.DECEMBER);
        calendar.add(Calendar.DAY_OF_MONTH, 3); // 년도 날짜 더하기(이동) 다른 필드에도 영향
        calendar.roll(calendar.YEAR, false); // 년도 날짜 더하기(이동) 다른 필드에 영향X
        System.out.println("Date Object: " + calendar.getTime());
        calendar.roll(calendar.YEAR, true);
        System.out.println("Date Object: " + calendar.getTime());

        Calendar newCalendar = Calendar.getInstance();
        System.out.println("Date Object: " + newCalendar.getTime());

        newCalendar.setTime(calendar.getTime()); // Time 설정
        System.out.println("Date Object: " + newCalendar.getTime());
    }
}
