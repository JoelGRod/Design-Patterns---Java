package com.factory.factoryabstract;

import com.factory.factoryabstract.factory.GCPizzaIngredientFactory;
import com.factory.factoryabstract.factory.PizzaIngredientFactory;
import com.factory.factoryabstract.pizzas.CheesePizza;
import com.factory.factoryabstract.pizzas.ClamPizza;
import com.factory.factoryabstract.pizzas.PepperoniPizza;
import com.factory.factoryabstract.pizzas.Pizza;
import com.factory.factoryabstract.pizzas.VeggiePizza;

public class GCPizzaStore extends PizzaStore {

    protected Pizza createPizza( String type ) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new GCPizzaIngredientFactory();

        if( type.equals("cheese") ) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Cheese Pizza GC");
        } else if( type.equals("pepperoni") ) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Pepperoni Pizza GC");
        } else if( type.equals("veggie") ) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Veggie Pizza GC");
        } else if( type.equals("clam") ) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Clam Pizza GC");
        }

        return pizza;
    }
    
}
