package timur.product.model;

public class Product {
    protected int barcode;
    protected String name;
    protected double price;

    public Product(int barcode, String name, double price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.print("Name: " + name + "\nPrice: " + price + "\nBarcode: " + barcode);
    }

    public static void showAllProducts(Product[] arr) {
        System.out.println("---------------");
        System.out.println("All products:");
        System.out.println("---------------");
        for (int i = 0; i < arr.length; i++) {
            arr[i].display();
            System.out.println("\n");
        }
    }


    public static int barcodeGenerator() {
        int barcode = (int) (Math.random() * 9999999);
        return barcode;
    }

    public int getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
