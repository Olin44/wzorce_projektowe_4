package Observer;

import java.util.ArrayList;

interface Subject {
    ArrayList<Observer> observers = new ArrayList<Observer>();

    default void attach(Observer observer){
        this.observers.add(observer);
    }

    default void detach(Observer observer){
        this.observers.remove(observer);
    }

    //zmiana nazwy, notify jest metodą klasy Object w Javie
    void notifyObservers();

}
