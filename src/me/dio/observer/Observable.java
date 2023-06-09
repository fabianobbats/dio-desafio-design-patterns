package me.dio.observer;

public interface Observable {

  void register(Observer observer);

  void unregister(Observer observer);

  void notifyAllObservers();

}