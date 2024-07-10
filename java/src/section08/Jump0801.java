package section08;

public class Jump0801 {
    public static void main(String[] args) {
        Animal cat = new Animal(); // class는 객체를 생성

        System.out.println(cat); // section08.Animal@4517d9a3(객체)
        System.out.println(cat.name);

        cat.setName("Coco"); 
        
        System.out.println(cat.name);
    }
}
