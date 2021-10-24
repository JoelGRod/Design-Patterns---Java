package com.factory.factoryabstract.factory;

import com.factory.factoryabstract.ingredients.Cheese;
import com.factory.factoryabstract.ingredients.Clams;
import com.factory.factoryabstract.ingredients.Dough;
import com.factory.factoryabstract.ingredients.FreshClams;
import com.factory.factoryabstract.ingredients.GarlicVeggie;
import com.factory.factoryabstract.ingredients.MarinaraSauce;
import com.factory.factoryabstract.ingredients.MozzarellaCheese;
import com.factory.factoryabstract.ingredients.OnionVeggie;
import com.factory.factoryabstract.ingredients.Pepperoni;
import com.factory.factoryabstract.ingredients.RedPepperVeggie;
import com.factory.factoryabstract.ingredients.Sauce;
import com.factory.factoryabstract.ingredients.SlicedPepperoni;
import com.factory.factoryabstract.ingredients.ThickCrustDough;
import com.factory.factoryabstract.ingredients.Veggie;

public class TfPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Clams createClam() {
        return new FreshClams();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Veggie[] createVeggie() {
        Veggie veggies[] = { new GarlicVeggie(), new OnionVeggie(), new RedPepperVeggie() };
        return veggies;
    }
    
}
