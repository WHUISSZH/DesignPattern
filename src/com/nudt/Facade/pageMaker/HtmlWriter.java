package com.nudt.Facade.pageMaker;

import java.io.IOException;
import java.io.Writer;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/25 9:42
 * @description：编写简单的HTML页面
 * @modified By：
 * @version:
 */
public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void makeTitle(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    public void makeParagraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>");
    }

    public void makeLink(String href, String caption) throws IOException {
        makeParagraph("<a href =\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailaddress, String username) throws IOException {
        makeLink(mailaddress, username);
    }

    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>");
        writer.close();
    }
}
