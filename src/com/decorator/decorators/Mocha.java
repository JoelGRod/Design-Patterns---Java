package com.decorator.decorators;

import com.decorator.Beverage;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getSize() {
        return this.beverage.getSize();
    }

    public float cost() {
        return this.beverage.cost() + 0.20f;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
    
}
