package com.supertypes;

import com.supertypes.behaviors.FlyNoWay;
import com.supertypes.behaviors.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Model Duck!!");
    }
}
