package 凌志栋;

public class program6 {
    public  static void main(String[] args){
        for(int i=0;i<11;i++){
            for(int j=0;j<50;j++){
                for(int l=0;l<25;l++){
                    if(9*i+j+l==100&&2*i+2*j+4*l==100){
                        System.out.println(i+" nice head birds,"+j+" phoenix,"+l+" lions.");
                    }
                }
            }
        }
    }
}
