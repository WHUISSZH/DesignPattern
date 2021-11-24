package com.nudt.AbstractFactoryPattern.factory;


/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/24 9:17
 * @description：
 * @modified By：
 * @version:
 */
public abstract class Factory {
    public static Factory getFactory(String classname){
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);

}
