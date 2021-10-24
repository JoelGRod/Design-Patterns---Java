package com.factory.factoryabstract;

import com.factory.factoryabstract.pizzas.Pizza;

public abstract class PizzaStore {

    public void orderPizza( String type ) {
        Pizza pizza = this.createPizza( type );

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    protected abstract Pizza createPizza( String pizza );
    
}
