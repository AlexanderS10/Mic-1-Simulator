public class O {
    private ControlLine addr_cl;
    private ControlLine mbr_cl;
    private ControlLine mpc_cl;
    private ControlLine jmpc_cl;
    private boolean[] MPC= new boolean[8];
    public O(ControlLine addr, ControlLine mbr, ControlLine jmpc, ControlLine mpc){
        this.addr_cl = addr;
        this.mbr_cl = mbr;
        this.jmpc_cl = jmpc;
        this.mpc_cl=mpc;
        defineO();
    }
    private void defineO(){
        if(jmpc_cl.getValue()[0]){
            for(int i=1; i<9; i++){
                MPC[i-1]=addr_cl.getValue()[i] || mbr_cl.getValue()[i-1];
            }
        }
    }
    public boolean[] getO(){
        return this.MPC;
    }
}
