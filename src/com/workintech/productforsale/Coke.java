package com.workintech.productforsale;

public class Coke extends ProductForSale{

    private String brand;

    public Coke(String type, double price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    public String getBrand() {
            return brand;
        }

    @Override
    public void showDetails() {
            System.out.println("Coke's brand: " + getBrand());
    }


}
