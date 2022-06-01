package timur.product.model;

import java.util.Objects;

public class Food extends Product {
    protected boolean kosher;
    protected String expDate;


    public Food(int barcode, String name, double price, boolean kosher, String expDate) {
        super(barcode, name, price);
        this.kosher = kosher;
        this.expDate = expDate;
    }

//    @Override
//    public void display() {
//        super.display();
//        String ifKosher;
//        if (kosher) {
//            ifKosher = "Kosher";
//        } else {
//            ifKosher = "Not Kosher";
//        }
//        System.out.print("\n" + ifKosher + "\nExpiration Date: " + expDate);
//    }

    public String toString(){
        String ifKosher;
        if (kosher) {
            ifKosher = "Kosher";
        } else {
            ifKosher = "Not Kosher";
        }
        return super.toString() + "\n" + ifKosher + "\nExpiration Date: " + expDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Food food = (Food) o;
        return kosher == food.kosher && Objects.equals(expDate, food.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kosher, expDate);
    }

    public boolean isKosher() {
        return kosher;
    }

    public String getExpDate() {
        return expDate;
    }
}
