package com.supertypes.behaviors;
import com.supertypes.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I Can't fly");
    }
}
