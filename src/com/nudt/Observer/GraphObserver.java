package com.nudt.Observer;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/25 20:07
 * @description：
 * @modified By：
 * @version:
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        int number = generator.getNumber();
        System.out.printf("GraphObserver: %d ", number);
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
