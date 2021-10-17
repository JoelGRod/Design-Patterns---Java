package com.strategy.behaviors;

import com.strategy.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("Quack");
    }
    
}
