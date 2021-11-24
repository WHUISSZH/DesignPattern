package com.nudt.FactoryMethod.implementFactory;

import com.nudt.FactoryMethod.framework.Product;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 21:59
 * @description：
 * @modified By：
 * @version:
 */
public class IDcard extends Product {
    private String owner;
    private int id;

    public IDcard(String owner, int id) {
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "(" + id +")的卡" );
    }

    public String getOwner() {
        return owner;
    }

    public int getId() {
        return id;
    }
}
