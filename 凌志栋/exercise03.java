package 凌志栋;

class father{
    int a;
}
class son extends father{
    son(int x){
        a=x;
    }
}
public class exercise03 {
    public static void main(String[] args){
        son myson=new son(1);
        System.out.println(myson.a);
    }

}
