package com.nudt.SingletonPattern;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 15:22
 * @description：
 * @modified By：
 * @version:
 */
public class Singletonlazy {
    private static Singletonlazy singletonlazy;

    private Singletonlazy(){}

    public static Singletonlazy getInstance(){
        if (singletonlazy == null){
            singletonlazy = new Singletonlazy();
        }
        return singletonlazy;
    }
}
