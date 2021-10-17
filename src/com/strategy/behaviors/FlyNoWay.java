package com.strategy.behaviors;

import com.strategy.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I Can't fly");
    }
}
