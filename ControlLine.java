public class ControlLine {
    private boolean[] value;

    public ControlLine() {
    }
    public ControlLine(boolean [] var1) {
        this.value=var1;
    }

    public void setValue(boolean[] var1) {
        this.value = var1;
    }

    public boolean[] getValue() {
        return this.value;
    }
    public void copyTo(boolean [] a){
        for(int i=0; i<value.length; i++){
            a[i]=value[i];
        }
    }
}
