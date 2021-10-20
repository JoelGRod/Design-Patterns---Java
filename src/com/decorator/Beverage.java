package com.decorator;

public abstract class Beverage {

    public String description = "Beverage";
    public String size = "medium";

    public String getDescription() {
        return this.description + " " + this.getSize();
    }

    public void setSize(String size) {
        if( size == "small" 
            || size == "medium" 
            || size == "large") this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public abstract float cost();

}
