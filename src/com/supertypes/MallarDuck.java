package com.supertypes;

import com.supertypes.behaviors.FlyWithWings;
import com.supertypes.behaviors.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Mallar Duck!!");
    }

}
