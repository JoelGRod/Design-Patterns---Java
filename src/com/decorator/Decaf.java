package com.decorator;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf Coffee";
    }

    public float cost() {
        return 1.05f;
    }
    
}
