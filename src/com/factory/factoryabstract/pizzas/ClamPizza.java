package com.factory.factoryabstract.pizzas;

import com.factory.factoryabstract.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory ) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        this.dough = this.ingredientFactory.createDough();
        this.cheese = this.ingredientFactory.createCheese();
        this.sauce = this.ingredientFactory.createSauce();
        this.clams = this.ingredientFactory.createClam();
    }
     
}
