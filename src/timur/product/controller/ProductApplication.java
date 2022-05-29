package timur.product.controller;

import timur.product.model.Food;
import timur.product.model.Product;

public class ProductApplication {
    public static void main(String[] args) {
        Product[] store = new Product[8];
        store[0] = new Product(Product.barcodeGenerator(), "Gum", 9.99);
        store[1] = new Product(Product.barcodeGenerator(), "Sponge", 2.50);
        store[2] = new Food(Product.barcodeGenerator(), "Shrimps", 25.50, false, "25.02.25");
        store[3] = new Food(Product.barcodeGenerator(), "Chips", 13, true, "02.02.23");
        System.out.println(store[0].getBarcode());
        System.out.println(store[1].getBarcode());
        System.out.println(store[2].getBarcode());


    }
}
