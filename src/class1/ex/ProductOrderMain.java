package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        ProductOrder dubu = new ProductOrder();
        dubu.productName = "Dubu";
        dubu.price = 2000;
        dubu.quantity = 2;
        productOrders[0] = dubu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "Kimchi";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        productOrders[1] = kimchi;

        ProductOrder cola = new ProductOrder();
        cola.productName = "Cola";
        cola.price = 1500;
        cola.quantity = 2;
        productOrders[2] = cola;

        int total = 0;

        for (ProductOrder productOrder : productOrders) {
            System.out.println(productOrder.productName + " " + productOrder.quantity + " " + productOrder.price);
            total += productOrder.quantity * productOrder.price;
        }
        System.out.println(total);
    }
}
