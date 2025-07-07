package poly.ex4;

/*
추상 메서드만 가지고 있는 추상 클래스는 순수 추상 클래스.
실행 로직을 전혀 가지고 있지 않고 부모로써 껍데기만 제공하는 역할.
다형성을 위한 존재
마치 어떤 규격을 지켜서 구현해야 하는 것 같은 느낌.
이런 순수 추상 클래스의 개념은 프로그래밍에서 매우 자주 사용.
자바는 순수 추상 클래스를 더 편리하게 사용할 수 있도록 인터페이스라는 개념을 제공.
 */
public abstract class AbstractAnimal {
    public abstract void sound();

    public abstract void move();
}
