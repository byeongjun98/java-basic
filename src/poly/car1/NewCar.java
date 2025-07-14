package poly.car1;

/*
 * OCP(Open-Closed Principle) 원칙
 * - Open for extension, Closed for modification
 *  - 새로운 기능을 추가할 때 기존 코드를 수정하지 않고 기능을 확장할 수 있도록 설계하는 원칙
 * - Closed for modification
 *  - 기존 코드를 수정하지 않고 기능을 확장할 수 있도록 설계하는 원존
 * 
 * 확장에는 열려있고, 변경에는 닫혀 있다는 뜻인데, 
 * 쉽게 이야기 해서 기존의 코드 수정 없이 새로운 기능을 추가할 수 있다는 의미다.
 * 
 * 전략 패턴(Strategy Pattern)
 * 디자인 패턴 중에 가장 중요한 패턴을 하나 뽑으라고 하면 전략 패턴을 뽑을 수 있다.
 * 전략 패턴은 알고리즘을 클라이언트 코드의 변경 없이 쉽게 교체할 수 있다.
 * Car 인터페이스가 전략을 정의하는 인터페이스가 되고, 각각의 차량이 전략의 구체적인 구현이 된다.
 */

public class NewCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("NewCar 시동을 걸었습니다.");
    }
    @Override
    public void offEngine() {
        System.out.println("NewCar 시동을 껐습니다.");
    }
    @Override
    public void pressAccelerator() {
        System.out.println("NewCar 가속기를 밟았습니다.");
    }
}
