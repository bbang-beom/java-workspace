package section08;

public class Animal {
    /*          멤버(인스턴스(객체), 정적)
     * 속성         /       기능
     * 필드         /       메서드
     * field        /       method
     * 변수, 상수    /       method
     * 
     * 객체명 != 객체 변수    
     */

     String name; // 인스턴스 생성
    //  String name = "Navi"; // 이 방법으로 초기화 가능
    //  name = "Navi"; 이 방법으로 초기화 불가

    public void setName(String n) {
        name = n; // method를 사용하여 초기화 가능
    }
}
