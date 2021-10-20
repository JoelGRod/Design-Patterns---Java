package com.decorator.decorators;

import com.decorator.Beverage;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public float cost() {
        return this.beverage.cost() + 0.10f;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }
    
}
