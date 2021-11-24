package com.nudt.TemplateMethodPatten;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 19:22
 * @description：
 * @modified By：
 * @version:
 */
public abstract class AbstractDisplay {
    protected abstract void open();
    protected abstract void print();
    protected abstract void closed();

    protected final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        closed();
    }
}
