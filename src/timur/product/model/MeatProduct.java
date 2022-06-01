package timur.product.model;

import java.util.Objects;

public class MeatProduct extends Food {
    String meatType;

    public MeatProduct(int barcode, String name, double price, boolean kosher, String expDate, String meatType) {
        super(barcode, name, price, kosher, expDate);
        this.meatType = meatType;
    }

//    @Override
//    public void display() {
//        super.display();
//        System.out.print("\nType of Meat: " + meatType);
//    }

    @Override
    public String toString() {
        return super.toString() + "\nType of Meat: " + meatType;
    }

    public String getMeatType() {
        return meatType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MeatProduct that = (MeatProduct) o;
        return Objects.equals(meatType, that.meatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), meatType);
    }
}





