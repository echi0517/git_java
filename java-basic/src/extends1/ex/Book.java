package extends1.ex;

public class Book extends Item {

    private String athor;
    private String isbn;

    public Book(String name, int price, String athor, String isbn) {
        super(name, price);
        this.athor = athor;
        this.isbn = isbn;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("- 저자:" + athor + ", isbn:" + isbn);
    }

}
