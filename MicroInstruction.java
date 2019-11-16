import java.util.Arrays;

public class MicroInstruction {
    public Boolean[] nextAddress = new Boolean[9];
    public Boolean[] jam = new Boolean[3];
    public Boolean[] alu = new Boolean[8];
    public Boolean[] cBus = new Boolean[9];
    public Boolean[] mem = new Boolean[3];
    public Boolean[] bBus = new Boolean[4];

    public MicroInstruction() {
    }

    public MicroInstruction(Boolean[] nextAddress, Boolean[] jam, Boolean[] alu, Boolean[] cBus, Boolean[] mem, Boolean[] bBus) {
        this.nextAddress = nextAddress;
        this.jam = jam;
        this.alu = alu;
        this.cBus = cBus;
        this.mem = mem;
        this.bBus = bBus;
    }
    public String toString() {
        return "MicroInstruction \n[nextAddress=" + Arrays.toString(this.nextAddress) + ", \njam=" + Arrays.toString(this.jam) + ", \nalu=" + Arrays.toString(this.alu) + ", \ncBus=" + Arrays.toString(this.cBus) + ", \nmem=" + Arrays.toString(this.mem) + ", \nbBus=" + Arrays.toString(this.bBus) + "]";
    }

    public Boolean[] getNextAddress() {
        return this.nextAddress;
    }

    public void setNextAddress(Boolean[] nextAddress) {
        this.nextAddress = nextAddress;
    }

    public Boolean[] getJam() {
        return this.jam;
    }

    public void setJam(Boolean[] jam) {
        this.jam = jam;
    }

    public Boolean[] getAlu() {
        return this.alu;
    }

    public void setAlu(Boolean[] alu) {
        this.alu = alu;
    }

    public Boolean[] getcBus() {
        return this.cBus;
    }

    public void setcBus(Boolean[] cBus) {
        this.cBus = cBus;
    }

    public Boolean[] getMem() {
        return this.mem;
    }

    public void setMem(Boolean[] mem) {
        this.mem = mem;
    }

    public Boolean[] getbBus() {
        return this.bBus;
    }

    public void setbBus(Boolean[] bBus) {
        this.bBus = bBus;
    }
}
