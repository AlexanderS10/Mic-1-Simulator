public class HighBit {
    private ControlLine mpc_cl;
    private ControlLine n_cl;
    private ControlLine z_cl;
    private ControlLine jam_cl;

    public HighBit(ControlLine var1, ControlLine var2, ControlLine var3, ControlLine var4) {
        this.mpc_cl = var4;
        this.n_cl = var1;
        this.z_cl = var2;
        this.jam_cl = var3;
    }

    public void defineHB(){
        boolean[] var1 = new boolean[]{this.jam_cl.getValue()[1] && this.n_cl.getValue()[0] || this.jam_cl.getValue()[2] && this.z_cl.getValue()[0]};
        this.mpc_cl.setValue(var1);
    }
    public void poke() {
        boolean[] var1 = new boolean[]{this.jam_cl.getValue()[0] && this.n_cl.getValue()[0] || this.jam_cl.getValue()[1] && this.z_cl.getValue()[0]};
        this.mpc_cl.setValue(var1);
    }
}