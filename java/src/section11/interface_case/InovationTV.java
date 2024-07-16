package section11.interface_case;

public class InovationTV implements RemoteControl, AdvancedTV{
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
        System.out.println("SamsungLG TV is on");
    }

    @Override
    public void turnOff() {
        System.out.println("SamsungLG TV is off");
    }

    public void folded() {
        System.out.println("samsungLG TV is folded");
    }

    public void unfolded() {
        System.out.println("samsungLG is TV unfolded");
    }

    @Override
    public void rollUP() {
        System.out.println("samsungLG TV is rolling up");
    }

    @Override
    public void rollDown() {
        System.out.println("samsungLG TV is rolling down");
        
    }

    public void activateAI() {
        System.out.println("samsungLG TV AI is activated");
    }
    public void deactivateAI() {
        System.out.println("samsungLG TV AI is deactivated");

    }

}
