package timur.product.controller;

import timur.product.model.Food;
import timur.product.model.MeatProduct;
import timur.product.model.MilkProduct;
import timur.product.model.Product;

public class ProductApplication {
    public static void main(String[] args) {
        Product[] store = new Product[8];
        store[0] = new Product(Product.barcodeGenerator(), "Gum", 9.99);
        store[1] = new Product(Product.barcodeGenerator(), "Sponge", 2.50);
        store[2] = new Food(Product.barcodeGenerator(), "Shrimps", 25.50, false, "25.02.25");
        store[3] = new Food(Product.barcodeGenerator(), "Chips", 13, true, "02.02.23");
        store[4] = new MeatProduct(Product.barcodeGenerator(), "Bacon", 80, false, "03.03.23", "Pork");
        store[5] = new MeatProduct(Product.barcodeGenerator(), "Schnitzel", 50, true, "02.02.23", "Chicken");
        store[6] = new MilkProduct(Product.barcodeGenerator(), "GoatYoghurt", 4.90, true, "06.07.23", "Goat", 0.3F);
        store[7] = new MilkProduct(Product.barcodeGenerator(), "Milk", 11.50, true, "08.07.29", "Cow", 3.0F);


        Product.showAllProducts(store);
        totalPriceKosher(store);


    }


    public static void totalPriceKosher(Product[] arr) {
        double totalPrice = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Food && ((Food) arr[i]).isKosher()) {
                Food food = (Food) arr[i];
                totalPrice += arr[i].getPrice();
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Total Price of all Kosher Products:");
        System.out.println(totalPrice);
        System.out.println("--------------------------------------");

    }
}
