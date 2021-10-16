package com.supertypes;

import com.supertypes.interfaces.*;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior( FlyBehavior fb ) {
        flyBehavior = fb;
    }

    public void setQuackBehavior( QuackBehavior qb ) {
        quackBehavior = qb;
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}