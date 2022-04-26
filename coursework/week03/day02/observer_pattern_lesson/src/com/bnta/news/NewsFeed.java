package com.bnta;

import interfaces.IObserver;
import interfaces.ISubject;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed implements ISubject {

    private List<IObserver> observers;

    @Override
    public String toString() {
        return "NewsFeed{" +
                "observers=" + observers +
                '}';
    }

    public List<IObserver> getObservers() {
        return observers;
    }

    public NewsFeed(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void callObservers(String message){
        for(IObserver observer : observers){
            observer.update(message);
        }
    }

    @Override
    public void addObservers(IObserver observer){
        this.observers.add(observer);
    }


}
