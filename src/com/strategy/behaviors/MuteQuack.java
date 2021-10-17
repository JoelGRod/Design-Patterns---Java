package com.strategy.behaviors;

import com.strategy.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }
    
}
