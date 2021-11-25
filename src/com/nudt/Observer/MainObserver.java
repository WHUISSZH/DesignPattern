package com.nudt.Observer;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/25 20:02
 * @description： 叫 发布-订阅模式 或许更合适
 * @modified By：
 * @version:
 */
public class MainObserver {
    public static void main(String[] args) {
        DigitObserver digitObserver = new DigitObserver();
        GraphObserver graphObserver = new GraphObserver();
        ConcreteObserver concreteObserver = new ConcreteObserver();
//        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(50);
//        randomNumberGenerator.addObserver(digitObserver);
//        randomNumberGenerator.addObserver(graphObserver);
//        randomNumberGenerator.execute();

        IncrementalNumberGenerator incrementalNumberGenerator = new IncrementalNumberGenerator(10, 50, 10);
        incrementalNumberGenerator.addObserver(digitObserver);
        incrementalNumberGenerator.addObserver(graphObserver);
        incrementalNumberGenerator.addObserver(concreteObserver);
        incrementalNumberGenerator.execute();
    }
}
