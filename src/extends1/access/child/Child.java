package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 2; // 상속 관계 or 같은 패키지의 경우 접근 가능
//        defaultValue = 3; // 다른 패키지 접근 불가, 컴파일 오류
//        privateValue = 4; // 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); // 상속 관계 or 같은 패키지의 경우 접근 가능
//        defaultMethod(); // 다른 패키지 접근 불가, 컴파일 오류
//        privateMethod(); // 접근 불가, 컴파일 오류

        printParent();
    }
}
