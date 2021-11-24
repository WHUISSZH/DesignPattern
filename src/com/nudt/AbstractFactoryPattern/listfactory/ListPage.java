package com.nudt.AbstractFactoryPattern.listfactory;

import com.nudt.AbstractFactoryPattern.factory.Item;
import com.nudt.AbstractFactoryPattern.factory.Page;

import java.util.Iterator;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/24 9:19
 * @description：
 * @modified By：
 * @version:
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title><meta charset=\"UTF-8\">" + title  + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");

        Iterator iterator = content.iterator();
        while (iterator.hasNext()){
            Item next = (Item)iterator.next();
            buffer.append(next.makeHTML());
        }

        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
