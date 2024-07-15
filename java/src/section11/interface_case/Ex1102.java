package section11.interface_case;

public class Ex1102 {
    public static void main(String[] args) {
        SamsungTV samsungTV = new SamsungTV();
        samsungTV.turnOn();
        samsungTV.turnOff();
        samsungTV.setVolume(120);
        System.out.println(samsungTV.getVolume());
        samsungTV.folded();
        samsungTV.unfolded();

        System.out.println();

        LGTV lgtv = new LGTV();
        lgtv.turnOn();
        lgtv.turnOff();
        lgtv.setVolume(-20);
        System.out.println(lgtv.getVolume());
        lgtv.rollUP();
        lgtv.rollDown();

        System.out.println();

        SamsungLGTV samsungLGTV = new SamsungLGTV();
        samsungLGTV.turnOn();
        samsungLGTV.folded();
        samsungLGTV.rollUP();
        samsungLGTV.setVolume(80);
        System.out.println(samsungLGTV.getVolume());
        samsungLGTV.unfolded();
        samsungLGTV.rollDown();
        samsungLGTV.turnOff();

        System.out.println();

        InovationTV inovationTV = new InovationTV();
        inovationTV.userGuide();
        inovationTV.turnOn();
        inovationTV.folded();
        inovationTV.rollUP();
        inovationTV.setVolume(20);
        System.out.println(inovationTV.getVolume());
        inovationTV.unfolded();
        inovationTV.rollDown();
        inovationTV.turnOff();
        inovationTV.activateAI();
        inovationTV.deactivateAI();
    }
}
