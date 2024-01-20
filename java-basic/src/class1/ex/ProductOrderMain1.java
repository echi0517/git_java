package class1.ex;

public class ProductOrderMain1 {

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;
        productOrders[0] = tofu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        productOrders[1] = kimchi;

        ProductOrder cola = new ProductOrder();

        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;
        productOrders[2] = cola;

        int totalPrice = 0;

        for (ProductOrder order : productOrders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            totalPrice += (order.price * order.quantity);
        }
        System.out.println("총 결제 금액: " + totalPrice);
    }
}
