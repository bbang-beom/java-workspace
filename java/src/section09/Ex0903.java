package section09;

public class Ex0903 {
    public static void main(String[] args) {
        UnclearOverloading uo = new UnclearOverloading();
        uo.printfield();
        
        UnclearOverloading uo1 = new UnclearOverloading("JAVA", 10, 100);
        uo1.printfield();
    }
}
