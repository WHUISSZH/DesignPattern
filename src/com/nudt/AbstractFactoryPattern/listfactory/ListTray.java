package com.nudt.AbstractFactoryPattern.listfactory;

import com.nudt.AbstractFactoryPattern.factory.Item;
import com.nudt.AbstractFactoryPattern.factory.Tray;

import java.util.Iterator;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/24 9:19
 * @description：
 * @modified By：
 * @version:
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");

        Iterator iterator = tray.iterator();    // 实现嵌套TRAY实例的HTML创建
        while (iterator.hasNext()){
            Item next = (Item) iterator.next();
            buffer.append(next.makeHTML());
        }

        buffer.append("</li>\n");
        buffer.append("</ul>\n");
        return buffer.toString();
    }
}
