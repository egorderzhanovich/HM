package HM.aprilNine.callback;

public class Timer {
    CallbackExecutor ex;

    public Timer(CallbackExecutor ex) {
        this.ex = ex;
    }

    public void start(){
        ex.callback();
    }
}
