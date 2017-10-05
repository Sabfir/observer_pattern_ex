package com.opinta;

public class Subject {
    private ObserverList<Observer> observers = new ObserverList<Observer>();
    private Object field;

    public void setField(Object object) {
        this.field = object;
        System.out.println("Publisher sent info");
        observers.notifyObjectModified(this);
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }
}
