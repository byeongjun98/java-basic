package static2;

// static import 를 통해 클래스명 생략 가능
// 윈도우 기준 alt + enter
import static static2.DecoData.*;

public class DecoDataMain2 {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall(data1);

        // 추가
        // 인스턴스를 통한 접근
        // 권장하지 않는다. 정적 메서드니까 ~
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        staticCall();
    }
}
