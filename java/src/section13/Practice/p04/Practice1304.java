package section13.Practice.p04;

interface ButtonClickListener {
    void onClick();
}

public class Practice1304 {

    public static void simulateButtonClick(ButtonClickListener listener) {
        listener.onClick();
    }

    public static void main(String[] args) {
        ButtonClickListener button = new ButtonClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button clicked");
            }
        };
        simulateButtonClick(button);
    }
}
