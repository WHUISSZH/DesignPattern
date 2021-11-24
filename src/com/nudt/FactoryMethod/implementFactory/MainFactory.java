package com.nudt.FactoryMethod.implementFactory;

import com.nudt.FactoryMethod.framework.Product;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/6 21:08
 * @description：
 * @modified By：
 * @version:
 */
public class MainFactory {
    public static void main(String[] args) {
        IDcardFactory idFactory = new IDcardFactory();
        Product java = idFactory.createProduct("java");
        Product scala = idFactory.createProduct("scala");
        Product python = idFactory.createProduct("python");
        java.use();
        scala.use();
        python.use();
    }
}
