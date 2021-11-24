package com.nudt.FactoryMethod.framework;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 21:50
 * @description：
 * @modified By：
 * @version:
 */
public abstract class Factory {
    public abstract Product createProduct(String owner);
    public abstract void regiserProduct(Product product);

    public final Product create(String owner){
        Product product = createProduct(owner);
        regiserProduct(product);
        return product;
    }
}
