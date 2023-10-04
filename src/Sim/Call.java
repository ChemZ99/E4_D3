package Sim;

public class Call {
    private int Duration;
    private String CalledNumber;

    public Call(int Duration, String CalledNumber){
        this.Duration = Duration;
        this.CalledNumber = CalledNumber;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public String getCalledNumber() {
        return CalledNumber;
    }

    public void setCalledNumber(String calledNumber) {
        CalledNumber = calledNumber;
    }
}
