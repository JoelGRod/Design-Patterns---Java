package com.decorator.decorators;

import com.decorator.Beverage;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public float cost() {
        return this.beverage.cost() + 0.15f;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
    
}
