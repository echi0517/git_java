package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int count = 0;

    public void addItem(Item item) {

        if (count >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[count] = item;
        count++;


    }

    public void displayItems() {
        int totalPrice = 0;
        System.out.println("장바구나 상품 출력");

        for (int i = 0; i < count; i++) {
            items[i].getDisplayItem();
            totalPrice += items[i].getTotalPrice();
        }

        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;

        for (int i = 0; i < count; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

}
