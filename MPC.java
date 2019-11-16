public class MPC {
    private boolean[] MPC= new boolean[] {false, false, false, false, false, false, false, false, false};
    boolean highBit;

    public MPC(boolean [] address){
    setAddress(address);
    }
    public void setAddress(boolean[] address){
        if (address.length!=9){
            throw new UnsupportedOperationException("MPC must contain 9 bits");
        }
        else{
            for (int i=0; i<address.length; i++){
                MPC[i]=address[i];
            }
        }
    }
}
