package timur.product.controller;

import timur.product.model.Food;
import timur.product.model.MeatProduct;
import timur.product.model.MilkProduct;
import timur.product.model.Product;

public class ProductApplication {
    public static void main(String[] args) {
        Product[] store = new Product[8];
        store[0] = new Product(11111, "Gum", 9.99);
        store[1] = new Product(Product.barcodeGenerator(), "Sponge", 2.50);
        store[2] = new Food(3333, "Shrimps", 25.50, false, "25.02.25");
        store[3] = new Food(Product.barcodeGenerator(), "Chips", 13, true, "02.02.23");
        store[4] = new MeatProduct(Product.barcodeGenerator(), "Bacon", 80, false, "03.03.23", "Pork");
        store[5] = new MeatProduct(Product.barcodeGenerator(), "Schnitzel", 50, true, "02.02.23", "Chicken");
        store[6] = new MilkProduct(Product.barcodeGenerator(), "GoatYoghurt", 4.90, true, "06.07.23", "Goat", 0.3F);
        store[7] = new MilkProduct(Product.barcodeGenerator(), "Milk", 11.50, true, "08.07.29", "Cow", 3.0F);

        Product[] store1 = new Product[8];
        store1[0] = new Product(11111, "Gum", 9.99);
        store1[1] = new Product(Product.barcodeGenerator(), "Sponge", 2.50);
        store1[2] = new Food(3333, "Shrimps", 25.50, false, "25.02.25");
        store1[3] = new Food(Product.barcodeGenerator(), "Chips", 13, true, "02.02.23");
        store1[4] = new MeatProduct(Product.barcodeGenerator(), "Bacon", 80, false, "03.03.23", "Pork");
        store1[5] = new MeatProduct(Product.barcodeGenerator(), "Schnitzel", 50, true, "02.02.23", "Chicken");
        store1[6] = new MilkProduct(Product.barcodeGenerator(), "GoatYoghurt", 4.90, true, "06.07.23", "Goat", 0.3F);
        store1[7] = new MilkProduct(Product.barcodeGenerator(), "Milk", 11.50, true, "08.07.29", "Cow", 3.0F);


        Product.showAllProducts(store);
        totalPriceKosher(store);

//        System.out.println("\n\n======++++++++++++============");
//        Product prod = new Food(3333, "Shrimps", 25.50, false, "25.02.25");
//        boolean checker = prod.equals(store[2]);
//        System.out.println(checker);
//        prod.setPrice(30.30);
//
//        System.out.println(prod.getPrice());
//        System.out.println();
//        System.out.println(store[2].getPrice());
//        checker = prod.equals(store[2]);
//        System.out.println(checker);
            itemsChecker(store, store1);


    }

    public static void itemsChecker(Product[] arr, Product[] other){
        for (int i = 0; i < arr.length; i++) {
            boolean checker = arr[i].equals(other[i]);
            if (checker){
                System.out.println("Is product " + i + " in one store " +
                        "equals to product " + i +" in another? --- " + checker);
            }
            else {
                System.out.println("Is product " + (i+1) + " in one store " +
                        "equals to product " + (i+1) +" in another? --- " + checker);

            }

        }
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
