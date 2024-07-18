package section15.ex01;

class SampleEx05 {
    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }
}

public class Ex1505 {
    public static void main(String[] args) {
        
        Sample s = new Sample();
        Sample s1 = new Sample();
        Sample s2 = s;

        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println("s: " + s.hashCode());
        System.out.println("s1: " + s1.hashCode());
        System.out.println("s2: " + s2.hashCode());
    }
}
