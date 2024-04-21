package Threads;

public class MainThread {
    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            Thread1 thread1 = new Thread1();
            thread1.start();
            System.out.println("Main Thread Running");

            Thread thread = new Thread(new Thread2());
            thread.start();
        }
    }
}
