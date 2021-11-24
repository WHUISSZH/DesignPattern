package com.nudt.SingletonPattern.Test;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/5 9:52
 * @description：
 * @modified By：
 * @version:
 */
public class TicketMaker {
    private int ticker = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker(){

    }

    public static TicketMaker getTicketMaker(){
        return ticketMaker;
    }
    // 不同步的话在多线程环境中可能会返回相同的编号
    public synchronized int getTickerNum(){
        return ticker++;
    }
}

class Main{
    public static void main(String[] args) {
//        TicketMaker ticketMaker1 = TicketMaker.getTicketMaker();
//        TicketMaker ticketMaker = TicketMaker.getTicketMaker();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("ticketMaker: "+ticketMaker.getTickerNum());
//            System.out.println("ticketMaker1: "+ticketMaker1.getTickerNum());
//        }

        System.out.println("Start: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + TicketMaker.getTicketMaker().getTickerNum());
        }
        System.out.println("End.");
    }
}
