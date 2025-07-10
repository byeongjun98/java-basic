package diamond;

/*
인터페이스는 다중 구현이 되는 이유
인터페이스는 어차피 자식에서 다 구현하기 때문에 다이아몬드 문제가 발생하지 않는다.
클래스는 부모의 메서드가 중복되는 경우 어떤 메서드를 호출해야 할지 찾지 못하는 상황(다이아몬드 문제)이 생길 여지가 있어 다중 상속이 불가하다.
 */
public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        Child child = new Child();
        child.methodA();
        child.methodB();
        child.methodCommon();
    }

}
