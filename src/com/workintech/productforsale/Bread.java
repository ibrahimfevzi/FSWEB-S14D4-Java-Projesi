package com.workintech.productforsale;

public class Bread extends ProductForSale{

    private String shelfLife;

    public Bread(String type, double price, String description, String shelfLife) {
        super(type, price, description);
        this.shelfLife = shelfLife;
    }

    public String getShelfLife() {
        return shelfLife;
    }


    @Override
    public void showDetails() {
        System.out.println("Bread's shelf life: " + getShelfLife());

    }

}
