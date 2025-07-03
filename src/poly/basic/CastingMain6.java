package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        // 자바 16부터 지원, 다운캐스팅 코드 생략 instanceof 와 함께 변수 선언하여 사용
        if(parent instanceof Child child) {
            System.out.println("Child 인스턴스");
            child.childMethod();
        } else{
            System.out.println("Child 인스턴스가 아님");
        }
    }
}
