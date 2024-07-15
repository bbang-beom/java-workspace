package section11.interface_case;

public class SamsungTV implements RemoteControl, Foldable { // implements를 사용하여 interface를 구현
    private int volume;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if (volume < 0) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung TV is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV is off");
    }

    public void folded() {
        System.out.println("samsung TV is folded");
    }

    public void unfolded() {
        System.out.println("samsung is TV unfolded");
    }
}
