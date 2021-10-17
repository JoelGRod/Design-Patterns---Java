package com.strategy.behaviors;

import com.strategy.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm Flying!!");
    }
}
