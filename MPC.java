public class MPC {
    private boolean[] MPC= new boolean[9];
    private ControlLine mpc_cl=new ControlLine(MPC);
    private ControlLine O;
    private ControlLine High_bit;

    public MPC(ControlLine O, ControlLine high_bit){
        this.High_bit=high_bit;
        this.O=O;
        setMPC();
    }
    public void setMPC(){
        MPC[0]=High_bit.getValue()[0];
        MPC[1]=O.getValue()[0];
        MPC[2]=O.getValue()[1];
        MPC[3]=O.getValue()[2];
        MPC[4]=O.getValue()[3];
        MPC[5]=O.getValue()[4];
        MPC[6]=O.getValue()[5];
        MPC[7]=O.getValue()[6];
        MPC[8]=O.getValue()[7];
        mpc_cl.setValue(MPC);
    }

    public ControlLine GetMPC(){
        return this.mpc_cl;
    }
    public int getMPCInt(){
        int n = 0;
        for (int i = 0; i < 9; ++i) {
            n = (n << 1) + (MPC[i] ? 1 : 0);
        }
        return n;
    }
}
