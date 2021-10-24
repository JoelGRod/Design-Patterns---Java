package com.factory.factoryabstract.factory;

import com.factory.factoryabstract.ingredients.Cheese;
import com.factory.factoryabstract.ingredients.Clams;
import com.factory.factoryabstract.ingredients.Dough;
import com.factory.factoryabstract.ingredients.Pepperoni;
import com.factory.factoryabstract.ingredients.Sauce;
import com.factory.factoryabstract.ingredients.Veggie;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Clams createClam();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
    public Sauce createSauce();
    public Veggie[] createVeggie();
    
}
