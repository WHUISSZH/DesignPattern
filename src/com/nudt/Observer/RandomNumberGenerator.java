package com.nudt.Observer;

import java.util.Random;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/25 20:06
 * @description：
 * @modified By：
 * @version:
 */
public class RandomNumberGenerator extends NumberGenerator{
    private int bound = 0;
    private int num = 0;
    private Random random = new Random();

    public RandomNumberGenerator(int bound) {
        this.bound = bound;
    }

    @Override
    public int getNumber() {
        return this.num;
    }

    @Override
    public void execute() {
        for (int i = 0; i < bound; i++) {
            num = random.nextInt(bound);
            notifyObservers();
        }
    }
}
