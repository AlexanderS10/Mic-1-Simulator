public class Clock {
    private int time;
    private boolean run;
    public Clock(){
        time=0;
        run=false;
    }
    public void startTime() throws Exception{
        while (run){
            time+=1;
            Thread.sleep(1000);
            System.out.println(time);
        }
    }
    public int getTime(){
        return time;
    }
    public void printTime(){
        while (run) {
            System.out.println(time);
        }
    }

}
