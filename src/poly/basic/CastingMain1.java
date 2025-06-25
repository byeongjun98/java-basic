package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 자식의 기능은 호출 불가, 컴파일 오류 Ex) poly.childMethod();
        poly.parentMethod();

        // 다운캐스팅(부모 타입 -> 자식 타입)
        // 캐스팅을 한다고 해서 타입이 변하는 것은 아니다.
        // 업캐스팅은 부모타입으로 변경 / 다운캐스팅은 자식 타입으로 변경
        Child child = (Child) poly;
        child.childMethod();
    }
}
