package com.supertypes.behaviors;

import com.supertypes.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }
    
}
