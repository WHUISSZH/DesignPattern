package com.nudt.SingletonPattern;
import java.io.InputStream;
/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 15:28
 * @description：
 * @modified By：
 * @version:
 */
public class SingletonDCL {
    private volatile static SingletonDCL singletonDCL;
    private SingletonDCL(){}
    public static SingletonDCL getInstance(){
        if (singletonDCL == null){
            synchronized (SingletonDCL.class){
                if (singletonDCL == null){
                    singletonDCL = new SingletonDCL();
                }
            }
        }
        return singletonDCL;
    }
}
