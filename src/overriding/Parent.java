package overriding;

/*
다형성을 이루는 또 하나의 중요한 핵심 이론은 바로 메서드 오버라이딩이다.
메서드 오버라이딩에서 꼭 기억해야 할 점은 ** 오버라이딩 된 메서드가 항상 우선권을 가진다 **는 점이다.
그래서 이름도 기존 기능을 덮어 새로운 기능을 재정의 한다는 뜻의 오버라이딩이다.
*/
public class Parent {
    public String value = "parent";

    public void method(){
        System.out.println("Parent.method");
    }
}
