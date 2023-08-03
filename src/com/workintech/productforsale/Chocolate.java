package com.workintech.productforsale;

public class Chocolate extends ProductForSale{

    private int weight;



    public Chocolate(String type, double price, String description, int weight) {
        super(type, price, description);
        this.weight = weight;
    }



    public int getWeight() {
            return weight;
        }


    @Override
    public void showDetails() {

        System.out.println("Chocolate's weight: " + getWeight());

    }



}
