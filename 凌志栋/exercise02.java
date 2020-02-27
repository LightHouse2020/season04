package 凌志栋;

class Number {
    private int n1;
    private int n2;

    Number(int x,int y){
        n1=x;
        n2=y;
    }

    public void addtion(){
        System.out.println(this.n1+this.n2);
    }
    public void subtraction(){
        System.out.println(this.n1-this.n2);
    }
    public void multiplication(){
        System.out.println(this.n1*this.n2);
    }
    public void division(){
        System.out.println(this.n1/this.n2);
    }
}


public class exercise02 {
    public static void main(String[] args){
        Number num=new Number(1024,256);
        num.addtion();
        num.subtraction();
        num.division();
        num.multiplication();
    }
}
