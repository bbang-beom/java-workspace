package section09.Practice0901;

class Student {
    String name;
    int score;

    Student(String name) {
        this.name = name;
    }

    void setScore(int score) {
        this.score = score;
    }

    void printInfo() {
        System.out.printf("이름: %s, 성적: %d\n", name, score);
    }
}

public class Practice0901 {
    public static void main(String[] args) {
        Student student1 = new Student("김일남");
        Student student2 = new Student("김이남");

        student1.setScore(85);
        student2.setScore(92);

        student1.printInfo();
        student2.printInfo();
    }
}
