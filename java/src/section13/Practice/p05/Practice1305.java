package section13.Practice.p05;

public class Practice1305 {

    interface ClickListener {
        void onClick();
    }
    public static void main(String[] args) {
        ClickListener buttoClickListener = () -> {
                System.out.println("Button clicked"); // 한줄일 경우 {}; 생략가능
        };
        simulateButtonClick(buttoClickListener);
    }
    public static void simulateButtonClick(ClickListener listener) {
        listener.onClick();
    }
}
