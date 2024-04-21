package Synchronization;

public class MathsUtil {
    synchronized void getmathUtils(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
