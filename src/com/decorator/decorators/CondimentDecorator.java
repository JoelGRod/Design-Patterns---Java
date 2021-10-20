package com.decorator.decorators;

import com.decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
    public abstract String getSize();
    public abstract void setSize(String size);
    
}
