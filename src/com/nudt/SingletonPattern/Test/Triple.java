package com.nudt.SingletonPattern.Test;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 10:16
 * @description：
 * @modified By：
 * @version:
 */
public class Triple {
    private int id = 0;
    private static Triple[] triple = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2)
            };

    private Triple(int id){
        this.id = id;
        System.out.println("The instance " + id + " is created. ");
    }

    @Override
    public String toString() {
        return "tripe id = " + id;
    }

    public static Triple getTriple(int id){
        return triple[id];
    }
}

class Main1{
    public static void main(String[] args) {
        System.out.println("Start: ");
        for (int i = 0; i < 10; i++) {
            Triple triple = Triple.getTriple(i % 3);
            System.out.println(i + ": " + triple);
        }
        System.out.println("End.");
    }
}
