public class Decoder {
    private int enable=0;
    public Decoder(boolean [] a){
        if (a.length != 4){
            throw new UnsupportedOperationException("MIR has 4 bits for B bus");
        }
        int n = 0, l = a.length;
        for (int i = 0; i < l; ++i) {
            n = (n << 1) + (a[i] ? 1 : 0);
        }
        if (n<=8){
            enable=n;
        }
        else {
            throw new ArithmeticException("No such register exists: The number of registers connected to the the B bus is 8");
        }
    }
    public int getEnable(){
        return enable;
    }
}
