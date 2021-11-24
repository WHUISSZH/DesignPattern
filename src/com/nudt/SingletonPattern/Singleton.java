package com.nudt.SingletonPattern;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 9:45
 * @description：
 * @modified By：
 * @version:
 */
public class Singleton {
    // 静态变量，在外界第一次调用 getInstance() 方法时，类加载时生成实例
    private static Singleton singleton = new Singleton();

    // 只是将实例化方法私有化，对外界关闭，方法体里面其实不创建实例
    private Singleton(){
        System.out.println("生成了一个实例！！！");
    }

    // 公共静态方法，留给外界获取实例的窗口
    public static Singleton getInstance(){
        return singleton;
    }
}


class Main3 {
    public static void main(String[] args) {
        System.out.println("Start:");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        if (instance == instance1){
            System.out.println("两者是相同的实例");
        }else {
            System.out.println("两者不是同一个实例");
        }
        System.out.println("End.");
    }
}