package com.nudt.Observer;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/25 20:06
 * @description：
 * @modified By：
 * @version:
 */
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void delObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer next = (Observer) iterator.next();
            next.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
