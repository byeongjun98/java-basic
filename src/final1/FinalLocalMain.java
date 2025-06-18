package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;
//        data1 = 20; // final 은 최초 한번만 할당 가능하기에 컴파일 오류

        final int data2 = 10;
        method(data2);

    }
    static void method(final int parameter){
        // parameter = 20; // 파라미터를 final 받으면 파라미터 변경 불가하기에 컴파일 오류
    }
}
