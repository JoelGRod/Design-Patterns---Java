package com.factory.factoryabstract.pizzas;

import com.factory.factoryabstract.ingredients.Cheese;
import com.factory.factoryabstract.ingredients.Clams;
import com.factory.factoryabstract.ingredients.Dough;
import com.factory.factoryabstract.ingredients.Pepperoni;
import com.factory.factoryabstract.ingredients.Sauce;
import com.factory.factoryabstract.ingredients.Veggie;

public abstract class Pizza {

    public String name;
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;
    public Veggie[] veggies;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return this.name;
    }

    
}
