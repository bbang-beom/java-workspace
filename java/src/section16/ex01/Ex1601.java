package section16.ex01;

class ClassInt {
    private int element;

    public Object getElement() {
        return this.element;
    }

    public void setElement(int element) {
        this.element = element;
    }
}

class ClassString {
    private String element;

    public String getElement() {
        return this.element;
    }

    public void setElement(String element) {
        this.element = element;
    }
}

class ClassDouble {
    private Double element;

    public Double getElement() {
        return this.element;
    }

    public void setElement(Double element) {
        this.element = element;
    }
}

class ClassGeneric<E>{ // Generic class 생성
    // Generic 생성
    private E element;

    public E getElement() {
        return this.element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}

public class Ex1601 {
    public static void main(String[] args) {
        ClassInt classInt = new ClassInt();
        classInt.setElement(10);
        System.out.println(classInt.getElement());

        ClassString classString = new ClassString();
        classString.setElement("100");
        System.out.println(classString.getElement());

        ClassDouble classDouble = new ClassDouble();
        classDouble.setElement(3.14);
        System.out.println(classDouble.getElement());

        ClassGeneric<Integer> ClassGenericInt = new ClassGeneric<Integer>(); // generic 객체 생성 (참조type 사용 기본형 불가)
        ClassGenericInt.setElement(10);
        System.out.println(ClassGenericInt.getElement());

        ClassGeneric<String> ClassGenericString = new ClassGeneric<>(); // 오른쪽<>에는 생략가능(생략하는게 일반적임)
        ClassGenericString.setElement("100");
        System.out.println(ClassGenericString.getElement());

        ClassGeneric<Double> ClassGenericDouble = new ClassGeneric<>(); 
        ClassGenericDouble.setElement(3.14);
        System.out.println(ClassGenericDouble.getElement());


    }
}
