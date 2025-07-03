package poly.basic;

// 다운 캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child)  parent1;

        Parent parent2 = new Parent();
        Child child2 = (Child)  parent2; // 런타임 오류 - ClassCastException
        child2.childMethod(); // 실행 불가

        /*
        업캐스팅은 이런 문제가 절대 발생하지 않는다. 객체를 생성하면 해당 타입의 상위 부모 타입은 모두 함께 생성되기 때문
        부모 객체 생성시에 자식은 생성되지 않기 때문에 이런 문제가 발생한다.
        개발자가 이런 다운캐스팅의 문제점을 인지하고 의도적으로 사용하는 것을 표현하기 위해 명시적으로 캐스팅 해야한다.
        */

        /*
        컴파일 오류 vs 런타임 오류
        컴파일 오류: 변수명 오타, 잘못된 클래스 이름 사용 등 자바 프로그램을 실행하기 전에 발생하는 오류, 이런 오류는 IDE 에서 즉시 확인 가능하기에 안전하고 좋은 오류
        런타임 오류: 프로그램이 실행되고 있는 시점에 발생하는 오류, 프로그램을 실행하는 도중에 발생하기 때문에 매우 좋지 않다.
         */
    }


}
