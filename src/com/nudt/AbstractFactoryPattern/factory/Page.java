package com.nudt.AbstractFactoryPattern.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/24 9:17
 * @description：
 * @modified By：
 * @version:
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        content.add(item);
    }

    public void output(){
        try{
            String filename = title + ".html";
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(this.makeHTML());                  // 直接存储在项目的根目录下了，证明默认存储位置就是这
            fileWriter.close();
            System.out.printf("%s 编写完成！！！\n", filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
