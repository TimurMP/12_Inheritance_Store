package timur.product.model;

public class MilkProduct extends Food {
    String milkType;
    float fat;

    public MilkProduct(int barcode, String name, double price, boolean kosher, String expDate, String milkType, float fat) {
        super(barcode, name, price, kosher, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\nType of Milk: " + milkType + "\nFat: " + fat);
    }
}
