package me.dio.observer;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements Observable {
  private List<Observer> observers = new ArrayList<Observer>();
  private int temperatura;

  public void setTemperatura(int temperatura) {
    if(this.temperatura != temperatura) {
      this.temperatura = temperatura;
      notifyAllObservers();
    }
  }

  @Override
  public void notifyAllObservers() {
    observers.stream().forEach(observer -> observer.update(temperatura));
  }

  @Override
  public void register(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void unregister(Observer observer) {
    this.observers.remove(observer);
  }
  
}
