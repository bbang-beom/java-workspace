package section10.ex05;

public class Jump1005 {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("poppy");
        houseDog.sleep();
        houseDog.guardHouse();

        Dog dog = houseDog;
        // dog.guardHouse(); 형변환한 객체는 별개로 추가한 method 사용 불가
        dog.sleep(); // 형변환한 객체는 overriding 하여도 자식 class의 mehod 출력
    }
}
