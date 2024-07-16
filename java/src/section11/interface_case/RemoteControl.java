package section11.interface_case;

public interface RemoteControl {
    public static final int MAX_VOLUME = 100;
    int MIN_VOLUME = 0; // static final를 적지 않아도 상수 생성

    public abstract void turnOn();
    void turnOff(); // abstract를 적지 않아도 추상 method로 생성

    default void userGuide() { // 추상 method가 아닐때는 void 앞에 default를 붙여준다
        System.out.println("Welcome!");
    }

}
