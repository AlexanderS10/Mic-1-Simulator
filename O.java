public class O {
    private ControlLine addr_cl;
    private ControlLine mbr_cl;
    private ControlLine mpc_cl;
    private ControlLine jmpc_cl;

    public O(ControlLine addr, ControlLine mbr, ControlLine jmpc, ControlLine mpc) {
        this.addr_cl = addr;
        this.mbr_cl = mbr;
        this.jmpc_cl = jmpc;
        defineO();
    }
    public void defineO(){
        if(jmpc_cl.getValue()[0]){
            int j=0;
            boolean [] mpc= new boolean [8];
            for(int i=1; i<8; i++){
                mpc[j]=addr_cl.getValue()[i] || mbr_cl.getValue()[j];
                j++;
            }
            mpc_cl.setValue(mpc);
        }
        else {
            return;
        }
    }
    public boolean[] getMPC(){
        return this.mpc_cl.getValue();
    }
}
