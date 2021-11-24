package com.nudt.TemplateMethodPatten;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 19:25
 * @description：
 * @modified By：
 * @version:
 */
public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    protected void print() {
        System.out.print(ch);
    }

    @Override
    protected void closed() {
        System.out.println(">>");
    }
}
