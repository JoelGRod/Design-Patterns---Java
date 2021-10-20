package com.decorator.decorators;

import com.decorator.Beverage;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk( Beverage beverage ) {
        this.beverage = beverage;
    }

    public String getSize() {
        return this.beverage.getSize();
    }

    public void setSize( String size ) {
        this.beverage.setSize(size);
    }

    public float cost() {
        return this.beverage.cost() + 0.10f;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }
    
}
