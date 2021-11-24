package com.nudt.AbstractFactoryPattern;

import com.nudt.AbstractFactoryPattern.factory.Factory;
import com.nudt.AbstractFactoryPattern.factory.Link;
import com.nudt.AbstractFactoryPattern.factory.Page;
import com.nudt.AbstractFactoryPattern.factory.Tray;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/24 9:12
 * @description：
 * @modified By：
 * @version:
 */
public class MainAbstractFactory {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("输入参数有误！！！");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]); // 父类声明子类对象，多态

        Link google = factory.createLink("google", "https://www.google.com.hk/?gfe_rd=cr&dcr=0&ei=_-iMWtqVEu7s8AfnvJzgCQ");
        Link google_hk = factory.createLink("google hk", "https://www.google.com.hk/?gfe_rd=cr&dcr=0&ei=_-iMWtqVEu7s8AfnvJzgCQ");
        Link baidu = factory.createLink("baidu","https://www.baidu.com");
        Link bi = factory.createLink("b站", "https://www.bilibili.com/");
        Link bh = factory.createLink("b乎","https://www.baidu.com");

        Tray trayGoogle = factory.createTray("google");
        trayGoogle.add(google);
        trayGoogle.add(google_hk);

        Tray search = factory.createTray("search");
        search.add(trayGoogle); // 嵌套tray
        search.add(baidu);

        Tray forFun = factory.createTray("forFun");
        forFun.add(bi);
        forFun.add(bh);

        Page page = factory.createPage("LinkPage", "hui");
        page.add(search);
        page.add(forFun);
        page.output();
    }
}
