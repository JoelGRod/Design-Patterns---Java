package com.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso Coffee";
    }

    public float cost() {
        return 1.99f;
    }
    
}
