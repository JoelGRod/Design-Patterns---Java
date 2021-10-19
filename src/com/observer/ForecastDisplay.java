package com.observer;

import com.observer.interfaces.Display;
import com.observer.interfaces.Observer;
import com.observer.interfaces.Subject;

public class ForecastDisplay implements Display, Observer {

    private float lastPressure;
    private float currentPressure = 0.0f;
    private Subject wd;

    public ForecastDisplay(Subject weatherData) {
        this.wd = weatherData;
        this.wd.registerObserver(this);
    }
    
    public void display() {
        System.out.print("Forecast: ");
        if(this.currentPressure > this.lastPressure ) {
            System.out.println("Improving weather on the way!");
        } else if( this.currentPressure == this.lastPressure ) {
            System.out.println("More of the same");
        } else if( this.currentPressure < this.lastPressure ) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    public void update(float temp, float humidity, float pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;

        this.display();
    }
    
}
