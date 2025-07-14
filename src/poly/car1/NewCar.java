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
