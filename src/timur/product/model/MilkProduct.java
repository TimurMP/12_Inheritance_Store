package timur.product.model;

import java.util.Objects;

public class MilkProduct extends Food {
    String milkType;
    float fat;

    public MilkProduct(int barcode, String name, double price, boolean kosher, String expDate, String milkType, float fat) {
        super(barcode, name, price, kosher, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

//    @Override
//    public void display() {
//        super.display();
//        System.out.print("\nType of Milk: " + milkType + "\nFat: " + fat);
//    }

    @Override
    public String toString() {
        return super.toString() + "\nType of Milk: " + milkType + "\nFat: " + fat;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MilkProduct that = (MilkProduct) o;
        return Float.compare(that.fat, fat) == 0 && Objects.equals(milkType, that.milkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), milkType, fat);
    }
}
