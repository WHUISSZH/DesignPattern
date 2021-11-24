package com.nudt.SingletonPattern;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 13:18
 * @description：
 * @modified By：
 * @version:
 */
public enum  SingletonEnum {
    SINGLETONENUM;
    private int id = 0;

    SingletonEnum(){}

    public void setId(int id) {
        this.id = id;
    }

    public void doSomething(){
        System.out.println("do something.");
    }

    @Override
    public String toString() {
        return "singleton id is " + id;
    }
}

class Main2 {

    public static void main(String[] args) {
        SingletonEnum.SINGLETONENUM.setId(100);
        SingletonEnum.SINGLETONENUM.doSomething();
        System.out.println(SingletonEnum.SINGLETONENUM.toString());
    }
}