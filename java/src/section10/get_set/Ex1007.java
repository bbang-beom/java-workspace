package section10.get_set;

class Person {
    int age = 0;
}

class PersonGetterSetter {
    private int age;

    public String getAge() {
        return this.age + "세";
    }

    public void setAge(int age) {
        if (age < 1) {
            System.out.println("올바른 나이를 입력하세요.");
        }else {
            this.age = age;
        }
    }
}


public class Ex1007 {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = -99;

        System.out.println(p.age + "세");
        System.out.println();

        PersonGetterSetter p2 = new PersonGetterSetter();
        p2.setAge(99);
        System.out.println(p2.getAge());
    }
}
