package access.b;

// default class 라 호출 불가
//import access.a.DefaultClass1;
//import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

//        다른 패키지의 default class 호출 불가
//        DefaultClass1 defaultClass1 = new DefaultClass1();
//        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
