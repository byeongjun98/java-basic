package access.a;

public class PublicClass {
    public static void main(String[] args) {

        // 하나의 자바파일에 public 클래스는 하나
        // public 클래스 명은 파일명과 동일해야함
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1{

}

class DefaultClass2{

}
