package com.decorator.decorators;

import com.decorator.Beverage;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getSize() {
        return this.beverage.getSize();
    }

    public float cost() {
        float cost = this.beverage.cost();
        if(this.getSize() == "small") 
            return cost + 0.10f;
        if(this.getSize() == "large") 
            return cost + 0.20f;
        // Medium size
        return cost + 0.15f;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
    
}
