package timur.product.model;

public class Food extends Product {
    private boolean kosher;
    private String expDate;


    public Food(int barcode, String name, double price, boolean kosher, String expDate) {
        super(barcode, name, price);
        this.kosher = kosher;
        this.expDate = expDate;
    }
}
