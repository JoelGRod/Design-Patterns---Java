package com.decorator;

public abstract class Beverage {

    public String description = "Beverage";

    public abstract float cost();

    public String getDescription() {
        return this.description;
    }
    
}
