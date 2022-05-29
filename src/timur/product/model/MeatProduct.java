package timur.product.model;

public class MeatProduct extends Food {
    String meatType;

    public MeatProduct(double barcode, String name, double price, boolean kosher, String expDate, String meatType) {
        super(barcode, name, price, kosher, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }
}
