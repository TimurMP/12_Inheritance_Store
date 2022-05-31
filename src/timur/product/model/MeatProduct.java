package timur.product.model;

public class MeatProduct extends Food {
    String meatType;

    public MeatProduct(int barcode, String name, double price, boolean kosher, String expDate, String meatType) {
        super(barcode, name, price, kosher, expDate);
        this.meatType = meatType;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\nType of Meat: " + meatType);
    }

    public String getMeatType() {
        return meatType;
    }
}





