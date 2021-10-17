package com.strategy;

import com.strategy.behaviors.FlyNoWay;
import com.strategy.behaviors.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Model Duck!!");
    }
}
