/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;

/**
 *
 * @author elvis
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    
    public int getState() {
        return state;
    }
    
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    
    public void attach(Observer observer){
        observers.add(observer);
    }
    
    public void notifyAllObservers() {
        observers.forEach((observer) -> {
            observer.update();
        });
    }
}
