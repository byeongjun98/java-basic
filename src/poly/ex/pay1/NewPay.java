package poly.ex.pay1;

public class NewPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("NewPay 시스템과 연결합니다.");
        System.out.println(amount + "원을 결제합니다.");
        return true;
    }

}
