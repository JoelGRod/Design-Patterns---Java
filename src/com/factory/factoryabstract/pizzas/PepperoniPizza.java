package com.factory.factoryabstract.pizzas;

import com.factory.factoryabstract.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza( PizzaIngredientFactory ingredientFactory ) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + this.name);

        this.dough = this.ingredientFactory.createDough();
        System.out.println("Adding: " + this.dough.toString());

        this.sauce = this.ingredientFactory.createSauce();
        System.out.println("Adding: " + this.sauce.toString());

        this.cheese = this.ingredientFactory.createCheese();
        System.out.println("Adding: " + this.cheese.toString());

        this.pepperoni = this.ingredientFactory.createPepperoni();
        System.out.println("Adding: " + this.pepperoni.toString());
    }
    
}
