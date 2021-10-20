package com.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    public float cost() {
        return 0.89f;
    }
    
}
