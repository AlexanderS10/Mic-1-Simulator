public class HighBit {
    private ControlLine mpc_cl;
    private ControlLine n_cl;
    private ControlLine z_cl;
    private ControlLine jam_cl;
    private boolean[] mpc= new boolean[]{};

    public HighBit(ControlLine n, ControlLine z, ControlLine jam, ControlLine mpc) {
        this.mpc_cl = mpc;
        this.n_cl = n;
        this.z_cl = z;
        this.jam_cl = jam;
        defineHB();
    }
    public void defineHB(){
        boolean[] var1 = new boolean[]{this.jam_cl.getValue()[1] && this.n_cl.getValue()[0] || this.jam_cl.getValue()[2] && this.z_cl.getValue()[0]};
        this.mpc_cl.setValue(var1);
    }
    public ControlLine highBit_cl(){
        return mpc_cl;
    }
}
