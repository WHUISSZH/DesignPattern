package com.nudt.Facade.pageMaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/25 10:01
 * @description：
 * @modified By：
 * @version:
 */
public class PageMaker {
    private PageMaker() {
    }

    /**
     * @param mailaddress
     * @param filename
     */
    public static void makeWelcomePage(String mailaddress, String filename) {
        try {
            Properties maildata = Database.getProperties("maildata"); // 文件名，可自定义
            String username = maildata.getProperty(mailaddress); //根据输入的邮件地址从文本数据库中查找对应用户名
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(filename));
            htmlWriter.makeTitle("hello! Welcome to " + username + "`s page!!!");
            htmlWriter.makeParagraph("欢迎来到" + username + "的主页！！！");
            htmlWriter.makeParagraph("欢迎来信：");
            htmlWriter.mailto(mailaddress, username);
            htmlWriter.makeLink("SearchLinkPage.html", "友情链接");
            htmlWriter.makeLink("AllLinkPage.html", "mail address link");
            htmlWriter.close();

            System.out.printf("%s is created for %s (%s)\n", filename, mailaddress, username);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void makeLinkPage(String filename) {
        try {
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(filename));
            htmlWriter.makeTitle("mail Link page");
            Properties maildata = Database.getProperties("maildata");
            Enumeration<?> propertyNames = maildata.propertyNames();
            while (propertyNames.hasMoreElements()) {
                String mailaddress = (String) propertyNames.nextElement();
                String username = maildata.getProperty(mailaddress, "unknown");
                htmlWriter.mailto(mailaddress, username);
            }
            htmlWriter.close();
            System.out.printf("%s is created!!!\n", filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
