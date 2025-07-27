package com.luruoyang.test4;

/* 具体观察对象 */
public class ConcreteObservable extends Observable {
  public ConcreteObservable() {
    super();
  }

  @Override
  void addObserver(Observer observer) {
    super.addObserver(observer);
  }

  @Override
  void deleteObserver(Observer observer) {
    super.deleteObserver(observer);
  }

  @Override
  void notifyObservers() {
    super.notifyObservers();
  }

  @Override
  void notifyObservers(Object arg) {
    super.notifyObservers(arg);
  }

  @Override
  void deleteObservers() {
    super.deleteObservers();
  }

  @Override
  public boolean hasChanged() {
    return super.hasChanged();
  }

  @Override
  public void setChanged(boolean changed) {
    super.setChanged(changed);
  }

  @Override
  int countObservers() {
    return super.countObservers();
  }

  @Override
  public void clearChanged() {
    super.clearChanged();
  }
}
