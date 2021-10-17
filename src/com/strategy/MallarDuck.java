package com.strategy;

import com.strategy.behaviors.FlyWithWings;
import com.strategy.behaviors.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Mallar Duck!!");
    }

}
