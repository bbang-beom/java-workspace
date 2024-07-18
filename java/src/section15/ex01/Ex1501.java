package section15.ex01;

class Sample extends Object {
    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toString(hashCode());
    }

    public class Ex1501 {
        public static void main(String[] args) {   
            Sample s = new Sample();
            System.out.println(s.toString());
        }

    }
}
