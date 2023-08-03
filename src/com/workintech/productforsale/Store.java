package com.workintech.productforsale;



public class Store {
    public static void main(String[] args) {

        listProducts(new ProductForSale[]{
                new Bread("Bread", 1.5, "White bread", "2 days"),
                new Chocolate("Chocolate", 2.5, "Dark chocolate", 100),
                new Coke("Coke", 1.0, "Coca cola light", "Coca cola")
        });
    }

    public static void listProducts(ProductForSale[] products) {

for (ProductForSale product : products) {
            System.out.println("Type: " + product.getType());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Description: " + product.getDescription());
            product.showDetails();
            System.out.println();
        }



    }
}