package com.nudt.TemplateMethodPatten;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 19:33
 * @description：
 * @modified By：
 * @version:
 */
public class Main {
    public static void main(String[] args) {
        CharDisplay charDisplay = new CharDisplay('k');
        StringDisplay stringDisplay = new StringDisplay("hello");
        charDisplay.display();
        stringDisplay.display();
    }
}
