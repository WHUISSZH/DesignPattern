package com.nudt.Facade;

import com.nudt.Facade.pageMaker.PageMaker;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/24 22:05
 * @description：
 * @modified By：
 * @version:
 */
public class MainFacade {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("1469677378@qq.com","welcome.html");
    }
}
