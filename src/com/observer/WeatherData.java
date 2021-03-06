package com.observer;

import java.util.ArrayList;

import com.observer.interfaces.Observer;
import com.observer.interfaces.Subject;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void removeObserver(Observer o) {
        int index = this.observers.indexOf(o);
        if( index >= 0 ) this.observers.remove(index);
    }

    public void notifyObservers() {
        for( int i = 0; i < this.observers.size(); i++ ) {
            Observer observer = this.observers.get(i);
            // Better pass the entire object with public getters?
            observer.update(this.temp, this.humidity, this.pressure);
        }
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    // Extra methods here -> public Getters
}
