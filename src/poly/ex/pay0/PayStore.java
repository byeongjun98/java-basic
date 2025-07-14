package poly.ex.pay0;

/*
 *Null Object 패턴 (Null Object Pattern)
개념
null 대신 동작하는 "빈 객체"를 만들어서, null 체크 없이도 안전하게 메서드를 호출할 수 있게 하는 디자인 패턴입니다.
즉, null을 직접 사용하지 않고, 아무 동작도 하지 않는 객체(Null Object)를 만들어서 사용합니다.
 */
public abstract class PayStore {
    public static Pay findPay(String payOption) {
        if (payOption.equals("kakao")) {
            return new KakaoPay();
        } else if (payOption.equals("naver")) {
            return new NaverPay();
        } else if (payOption.equals("new")) {
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}
