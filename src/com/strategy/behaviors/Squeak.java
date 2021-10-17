package com.strategy.behaviors;

import com.strategy.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {

    public void quack() {
        System.out.println("Squeak");
    }
    
}
