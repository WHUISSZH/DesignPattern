package com.nudt.SingletonPattern;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 15:31
 * @description：
 * @modified By：
 * @version:
 */
public class SingletonStaticClass {
    private static class SingletonHolder {
        private static final SingletonStaticClass INSTANCE = new SingletonStaticClass();
    }

    private SingletonStaticClass() {
    }

    public static final SingletonStaticClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
