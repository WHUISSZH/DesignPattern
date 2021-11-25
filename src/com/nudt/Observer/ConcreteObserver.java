package com.nudt.Observer;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/25 21:04
 * @description：
 * @modified By：
 * @version:
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        int number = generator.getNumber();
        System.out.printf("ConcreteObserver: %d,", number);
        for (int i = 0; i <= number; i++) {
            System.out.printf("%3d",i);
        }
        System.out.println("");
    }
}
