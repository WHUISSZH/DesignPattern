package com.nudt.AbstractFactoryPattern.factory;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/24 9:17
 * @description：
 * @modified By：
 * @version:
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
