package com.nudt.FactoryMethod.implementFactory;

import com.nudt.FactoryMethod.framework.Factory;
import com.nudt.FactoryMethod.framework.Product;

import java.util.HashMap;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 21:59
 * @description：
 * @modified By：
 * @version:
 */
public class IDcardFactory extends Factory {
    private int id = 100;
    private HashMap<Integer, String> database = new HashMap<Integer, String>();

    @Override
    public synchronized Product createProduct(String owner) {
        return new IDcard(owner,id++);
    }

    @Override
    public void regiserProduct(Product product) {
        IDcard idcard = (IDcard) product;
        database.put(idcard.getId(),idcard.getOwner());
    }

    public HashMap<Integer, String> getDatabase() {
        return database;
    }
}
