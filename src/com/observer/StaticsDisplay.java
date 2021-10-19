package com.observer;

import com.observer.interfaces.Display;
import com.observer.interfaces.Observer;
import com.observer.interfaces.Subject;

public class StaticsDisplay implements Display, Observer {

    private float minTemp = 200.0f;
    private float maxTemp = 0.0f;
    private float tempSum = 0.0f;
    private int readings = 0;
    private Subject wd;

    public StaticsDisplay(Subject weatherData) {
        this.wd = weatherData;
        this.wd.registerObserver(this);
    }

    public void display() {
        System.out.println(
            "Avg/Max/Min temperature = " 
            + (tempSum / readings) + "/" 
            + this.maxTemp + "/" 
            + this.minTemp
        );
    }

    public void update(float temp, float humidity, float pressure) {
        this.tempSum += temp;
        this.readings++;

        if(this.maxTemp < temp) this.maxTemp = temp;
        if(this.minTemp > temp) this.minTemp = temp;

        this.display();
    }
}
