package com.nudt.Observer;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/25 20:07
 * @description：
 * @modified By：
 * @version:
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.printf("DigitObserver: %d\n", generator.getNumber());
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
