import java.util.Arrays;
public class ALU {
        private boolean INC = false, INVA=false, ENB=false, ENA= false, F0=false, F1=false, SRA1=false, SLL8=false;
        private int A=0, B=0, result=0;
        private boolean[] N= new boolean[1];
        private boolean[] Z= new boolean[1];
        public ALU(int ABus, int BBus){
                this.A= ABus;
                this.B= BBus;
        }
        public ALU(){}
        public boolean setControl(ControlLine control){
                        INC=control.getValue()[7];         //0
                        INVA=control.getValue()[6];        //1
                        ENB=control.getValue()[5];         //2
                        ENA=control.getValue()[4];         //3
                        F0=control.getValue()[3];          //4
                        F1=control.getValue()[2];          //5
                        SRA1=control.getValue()[1];        //6
                        SLL8=control.getValue()[0];        //7

                return true;
        }
        public int function(){
                if (F0 ==false && F1==true && ENA==true && ENB==false && INVA==false && INC==false){
                        return shift(A);
                }
                else if (F0 ==false && F1==true && ENA==false && ENB==true && INVA==false && INC==false){
                        return shift(B);
                }
                else if (F0 ==false && F1==true && ENA==true && ENB==false && INVA==true && INC==false){
                        return shift(~(A)-1);
                }
                else if (F0 ==true && F1==false && ENA==true && ENB==true && INVA==false && INC==false){
                        return shift(~(B)-1);
                }
                else if (F0 ==true && F1==true && ENA==true && ENB==true && INVA==false && INC==false){
                        return shift(A + B);
                }
                else if (F0 ==true && F1==true && ENA==true && ENB==true && INVA==false && INC==true){
                        return shift(A + B + 1);
                }
                else if (F0 ==true && F1==true && ENA==true && ENB==false && INVA==false && INC==true){
                        return shift(A + 1);
                }
                else if (F0 ==true && F1==true && ENA==false && ENB==true && INVA==false && INC==true){
                        return shift(B + 1);
                }
                else if (F0 ==true && F1==true  && ENA==true && ENB==true && INVA==true && INC==true){
                        return shift(B - A);
                }
                else if (F0 ==true && F1==true && ENA==false && ENB==true && INVA==true && INC==false){
                        return shift(B - 1);
                }
                else if (F0 ==true && F1==true && ENA==true && ENB==false && INVA==true && INC==true){
                        return shift(-A);
                }
                else if (F0 ==false && F1==false && ENA==true && ENB==true && INVA==false && INC==false){
                        return shift(A & B);
                }
                else if (F0 ==false && F1==true && ENA==true && ENB==true && INVA==false && INC==false){
                        return  shift(A | B);
                }
                else if (F0 ==false && F1==true && ENA==false && ENB==false && INVA==false && INC==false){
                        return shift(0);
                }
                else if (F0 ==true && F1==true && ENA==false && ENB==false && INVA==false && INC==true){
                        return shift(1);
                }
                else if (F0 ==true && F1==true && ENA==false && ENB==false && INVA==true && INC==false){
                        return shift(-1);
                }
                else{
                        System.out.println("No valid operation");
                        return 0;
                }
        }
        public int shift(int input){
                int shifted=input;
                if (SLL8==true){
                        shifted=input<<8;
                }
                else if(SRA1==true){
                        shifted=input>>1;
                }
                result=shifted;
                boolean[] var4 = new boolean[]{input == 0};
                boolean[] var5 = new boolean[]{input < 0};
                return shifted;
        }
        public boolean[] getN(){
                return N;
        }
        public boolean[] getZ(){
                return Z;
        }
        public void setA(Bus data){
                A=data.getValue();
        }
        public void setB(Bus data){
                B=data.getValue();
        }
}