package poly.ex5;

/*
순수 추상 클래스는 다음과 같은 특징을 가진다.
- 인스턴스를 생성할 수 없다.
- 상속시 모든 메서드를 오버라이딩 해야한다.
- 주로 다형성을 위해 사용된다.

인터헤이스는 앞서 설명한 순수 추상 클래스와 같다. 여기에 약간의 편의 기능이 추가된다.
- 인터페이스의 메서드는 모두 public, abstract 이다.
- 메서드에 public abstract 를 생략할 수 있다. 참고로 생략이 권장
- 인터페이스는 다중 구현(다중 상속)을 지원한다.

인터페이스에서 멤버 변수는 public, static, final이 모두 포함되었다고 간주.
해당 키워드는 생략할 수 있다.(생략이 권장)

클래스 상속관계는 UML 에서 실선으로 표기하지만 인터페이스 구현(상속)관계는 점선으로 표기
 */
public interface InterfaceAnimal {
    void sound(); // public abstract
    void move(); // public abstract
}
