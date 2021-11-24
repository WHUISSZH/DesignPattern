package com.nudt.AbstractFactoryPattern.listfactory;

import com.nudt.AbstractFactoryPattern.factory.Factory;
import com.nudt.AbstractFactoryPattern.factory.Link;
import com.nudt.AbstractFactoryPattern.factory.Page;
import com.nudt.AbstractFactoryPattern.factory.Tray;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/24 9:18
 * @description：
 * @modified By：
 * @version:
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
