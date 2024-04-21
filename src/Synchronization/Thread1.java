package Synchronization;

public class Thread1 implements Runnable {
    MathsUtil mu;

    public Thread1(MathsUtil mu){
        this.mu=mu;
    }

    @Override
    public void run() {
        try {


            mu.getmathUtils(2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
