package constructor.time;

public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        time.outPut();
        Time time2 = new Time(2);
        time2.outPut();
        Time time3 = new Time(23,59);
        time3.outPut();
        Time time4 = new Time(23,59,59);
        time4.outPut();
        Time time5= time2.coppyTime();
        time5.outPut();
    }
}
