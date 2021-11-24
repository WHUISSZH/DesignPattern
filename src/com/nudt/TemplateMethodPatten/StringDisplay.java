package com.nudt.TemplateMethodPatten;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 19:28
 * @description：
 * @modified By：
 * @version:
 */
public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;

    public StringDisplay(String s){
        this.string = s;
        this.width = s.getBytes().length;
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    protected void closed() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
