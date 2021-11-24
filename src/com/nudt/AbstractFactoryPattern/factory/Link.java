package com.nudt.AbstractFactoryPattern.factory;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/24 9:18
 * @description：
 * @modified By：
 * @version:
 */
public abstract class Link extends Item{
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
