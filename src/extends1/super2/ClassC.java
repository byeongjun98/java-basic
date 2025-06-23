package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        // 기본 생성자가 있는 경우에만 super 생략 가능
        // 생성자를 정의한 경우 (기본 생성자가 없는) super 생략 불가
        super(10, 20);
        System.out.println("ClassC 생성자");

    }
}
