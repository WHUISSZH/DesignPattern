package com.nudt.Observer;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/25 20:13
 * @description：
 * @modified By：
 * @version:
 */
public class IncrementalNumberGenerator extends NumberGenerator{
    private int start = 0;
    private int end = 0;
    private int step = 0;
    private int num = 0;

    public IncrementalNumberGenerator(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public int getNumber() {
        return this.num;
    }

    @Override
    public void execute() {
        for (int i = start; i < end; i+=step) {
            num = i;
            notifyObservers();
        }
    }
}
