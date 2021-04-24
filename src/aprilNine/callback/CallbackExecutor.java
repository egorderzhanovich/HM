package HM.aprilNine.callback;

import java.util.GregorianCalendar;

public class CallbackExecutor implements Callback{
    private int time = 1000;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public CallbackExecutor(int time) {
        this.time = time;
    }

    GregorianCalendar date = new GregorianCalendar();
    @Override
    public void callback() {
        System.out.println("Program started at " + date.getTime());
        while(true){
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((new GregorianCalendar().getTimeInMillis() - date.getTimeInMillis()) /1000   + " seconds has passed");
        }
    }
}