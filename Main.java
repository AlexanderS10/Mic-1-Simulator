import java.util.Arrays;

public class Main{
    public static void main (String [] args) throws ArrayIndexOutOfBoundsException, Exception{
        Clock clock=new Clock();
        clock.startTime();
       // clock.printTime();

        int time=0;
        boolean stop=false;
        boolean [] test=new boolean[]{false,false,true,true};
        boolean [] copied= new boolean[4];
        ControlLine cl=new ControlLine();
        cl.setValue(test);
        cl.copyTo(copied);
        while (stop==false){
            System.out.println(time + ": "+ cl.getValue()[time]+ " Copy= "+copied[time]);
            time+=1;
           //System.out.println(time);
            Thread.sleep(1000);
        }
     /*boolean control [] = new boolean[] {false, false, true, true, true, true, true, true};
     int A=8;
     int B=4;
     ALU alu=new ALU(A,B);
     alu.setControl(control);
     int result=alu.function();
     boolean a[]= new boolean[]{false,true,false,true};
        int n = 0, l = a.length;
        for (int i = 0; i < l; i++) {
            n = (n << 1) + (a[i] ? 1 : 0);
        }
        long start = System.nanoTime();

        long finish = System.nanoTime();
        long timeElapsed = finish - start;

     System.out.println(timeElapsed);*/
    }
    private boolean [] intToBits(int input){
        boolean[] bits = new boolean[32];
        for (int i = 31; i >= 0; i--) {
            bits[i] = (input & (1 << i)) != 0;
        }
        boolean [] bit8= new boolean[32];
        int j;
        for (int i=0 ; i<bit8.length; i++){
            j=bit8.length-1-i;
            bit8[i]=bits[j];
        }
        //System.out.println(input + " = " + Arrays.toString(bit8));
        return bit8;
    }
}