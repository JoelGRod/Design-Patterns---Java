package com.observer;

import com.observer.interfaces.Display;
import com.observer.interfaces.Observer;
import com.observer.interfaces.Subject;

public class CurrentConditionsDisplay implements Display, Observer {

    private float temp;
    private float humidity;
    private float pressure;
    private Subject wd;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.wd = weatherData;
        this.wd.registerObserver(this);
    }

    public void display() {
        System.out.println(
            "-------------------- \n"
            + "Weather conditions: \n"
            + "Temp: " + this.temp + "º C \n"
            + "Humidity: " + this.humidity + "% \n"
            + "Pressure: " + this.pressure);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
    
}
