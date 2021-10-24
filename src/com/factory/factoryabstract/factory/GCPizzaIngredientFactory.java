package com.factory.factoryabstract.factory;

import com.factory.factoryabstract.ingredients.Cheese;
import com.factory.factoryabstract.ingredients.Clams;
import com.factory.factoryabstract.ingredients.Dough;
import com.factory.factoryabstract.ingredients.FrozenClams;
import com.factory.factoryabstract.ingredients.GarlicVeggie;
import com.factory.factoryabstract.ingredients.MushroomVeggie;
import com.factory.factoryabstract.ingredients.OnionVeggie;
import com.factory.factoryabstract.ingredients.Pepperoni;
import com.factory.factoryabstract.ingredients.PlumTomatoSauce;
import com.factory.factoryabstract.ingredients.RedPepperVeggie;
import com.factory.factoryabstract.ingredients.ReggianoCheese;
import com.factory.factoryabstract.ingredients.Sauce;
import com.factory.factoryabstract.ingredients.SlicedPepperoni;
import com.factory.factoryabstract.ingredients.ThinCrustDough;
import com.factory.factoryabstract.ingredients.Veggie;

public class GCPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Clams createClam() {
        return new FrozenClams();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Veggie[] createVeggie() {
        Veggie veggies[] = { new GarlicVeggie(), new OnionVeggie(), new RedPepperVeggie(), new MushroomVeggie() };
        return veggies;
    }
    
}
