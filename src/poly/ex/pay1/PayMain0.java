package poly.ex.pay1;
import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while(true) {
            System.out.print("결제 방법을 선택하세요: ");
            String payOption = scanner.nextLine();

            
            if (payOption.equals("exit")) {
                return;
            }
            System.out.print("결제 금액을 입력하세요:");
            int amount = scanner.nextInt();
            scanner.nextLine();
            payService.processPay(payOption, amount);
        }
    }
}
