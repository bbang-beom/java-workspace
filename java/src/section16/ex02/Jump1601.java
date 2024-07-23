package section16.ex02;

import java.util.ArrayList;

public class Jump1601 {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138"); 
        pitches.add("129"); 
        pitches.add("142");
        
        System.out.println("pitches: " + pitches);
        System.out.println("pitches: " + pitches.get(1));
        System.out.println("pitches: " + pitches.contains("142"));
        System.out.println("pitches: " + pitches.contains(142));
        System.out.println("pitches: " + pitches.remove("142")); // 삭제할 요소가 있으면 true 반환
        System.out.println("pitches: " + pitches);
        System.out.println("pitches: " + pitches.remove(0)); // 삭제할 요소를 반환
        System.out.println("pitches: " + pitches);
    }
}
