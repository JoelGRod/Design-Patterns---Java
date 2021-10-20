package com.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast Coffee";
    }

    public float cost() {
        return 0.99f;
    }
    
}
