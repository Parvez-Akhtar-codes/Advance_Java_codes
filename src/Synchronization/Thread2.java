package Synchronization;

public class Thread2 implements Runnable {
    MathsUtil mu;
    public Thread2(MathsUtil mu){
        this.mu = mu;

    }
    @Override
    public void run() {
        try {
            mu.getmathUtils(3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
