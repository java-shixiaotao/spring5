package com.spring5.demoreactor.reactor8;

import java.util.Observable;

public class ObserveDemo extends Observable {
    public static void main(String[] args) {
        ObserveDemo observable = new ObserveDemo();
        observable.addObserver((o,arg) -> {
            System.out.println("发生变化");
        } );
        observable.addObserver((o,arg) -> {
            System.out.println("手动被观察者通知，准备改变");
        } );

        observable.setChanged();
        observable.notifyObservers();


    }

}
