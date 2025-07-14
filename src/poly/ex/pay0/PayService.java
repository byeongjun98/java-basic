package poly.ex.pay0;

public class PayService {
    public void processPay(String payOption, int amount) {
        boolean result = false;
        System.out.println("결제 방법: " + payOption + " 결제 금액: " + amount + "원");
        Pay pay = PayStore.findPay(payOption);
        
        result = pay.pay(amount);
        
        if (result) {
            System.out.println("결제 성공" + payOption + " 결제 금액: " + amount + "원");
        } else {
            System.out.println("결제 실패" );
        }
    }
        
}