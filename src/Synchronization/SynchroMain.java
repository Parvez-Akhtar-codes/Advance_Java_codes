package Synchronization;

public class SynchroMain {
    public static void main(String[] args) {
        MathsUtil mathsUtil = new MathsUtil();
        Thread t1 = new Thread(new Thread1(mathsUtil));
        Thread t2 = new Thread(new Thread2(mathsUtil));
        t1.start();
        t2.start();


    }
}
