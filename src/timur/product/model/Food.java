package timur.product.model;

public class Food extends Product {
    private boolean kosher;
    private String expDate;


    public Food(int barcode, String name, double price, boolean kosher, String expDate) {
        super(barcode, name, price);
        this.kosher = kosher;
        this.expDate = expDate;
    }

    @Override
    public void display() {
        super.display();
        String ifKosher;
        if (kosher){
            ifKosher = "Kosher";
        }
        else {
            ifKosher = "Not Kosher";
        }
        System.out.print("\n" + ifKosher + "\nExpiration Date: " +  expDate);
    }
}
