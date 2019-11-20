import java.util.Arrays;
public class Main{
    public static void main (String [] args) throws ArrayIndexOutOfBoundsException, Exception{
        boolean [] MBR=new boolean[]{false, false, true, false, true, true, false, false};
        boolean [] Z=new boolean[]{true};
        boolean [] N=new boolean[]{false};
        boolean [] JAM= new boolean[]{true, true, true};
        boolean [] Address= new boolean[]{false,false, false, false, true, false, false, true, true};
        boolean [] MPC= new boolean[]{false, false, false, false, false, false, false, false, false};
        ControlLine mbr_cl=new ControlLine(MBR);
        ControlLine Z_cl= new ControlLine(Z);
        ControlLine N_cl= new ControlLine(N);
        ControlLine jam_cl= new ControlLine(JAM);
        ControlLine mpc_cl= new ControlLine(MPC);
        ControlLine addr_cl= new ControlLine(Address);
        HighBit hb= new HighBit(N_cl, Z_cl, jam_cl, mpc_cl);
        System.out.println("High bit:"+hb.highBit_cl().getValue()[0]);
        O o= new O(addr_cl, mbr_cl, jam_cl, mpc_cl);
        int i=0;
        System.out.print("Address in O{ ");
        while (i<8) {
            System.out.print( o.getO()[i]+" ");
            i++;
        }
        System.out.print( "}\n");

        ControlLine o_cl= new ControlLine(o.getO());
        ControlLine highBit_cl= new ControlLine();
        highBit_cl=hb.highBit_cl();
        MPC add= new MPC(o_cl, highBit_cl);
        //add.setMPC();
        add.getMPCInt();
        System.out.print("Address in MPC: {");
        for (int j=0; j<9; j++) {
            System.out.print(add.GetMPC().getValue()[j]+" ");
        }
        System.out.println("}");
        /*
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
    */
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
        return bit8;
    }
}
