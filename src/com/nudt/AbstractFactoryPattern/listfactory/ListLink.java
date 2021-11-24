package com.nudt.AbstractFactoryPattern.listfactory;

import com.nudt.AbstractFactoryPattern.factory.Link;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/24 9:18
 * @description：
 * @modified By：
 * @version:
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
