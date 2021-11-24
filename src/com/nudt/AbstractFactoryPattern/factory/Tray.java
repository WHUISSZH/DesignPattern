package com.nudt.AbstractFactoryPattern.factory;

import java.util.ArrayList;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/24 9:18
 * @description：
 * @modified By：
 * @version:
 */
public abstract class Tray extends Item{
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        this.tray.add(item);
    }
}
