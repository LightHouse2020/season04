package 凌志栋;

class auto{
    public int numofwheels;
    public String color;
    public int weight;
    public int speed;

    auto(int a1,String a2,int a3,int a4){
        numofwheels=a1;
        color=a2;
        weight=a3;
        speed=a4;
    }
    public void accelerate(int a){
        this.speed+=a;
    }//speed +a
    public void decelerate(int a){
        this.speed-=a;
    }//speed -a
    public void stop(){
        this.speed=0;
    }
}

class car extends auto{
    public String CD;
    public int temprature;

    car(int a1, String a2, int a3, int a4) {
        super(a1, a2, a3, a4);
    }

    public void accelerate(int a){
        this.speed*=a;
    }//speed 2x
    public void decelerate(int a){
        this.speed/=a;
    }//speed 0.5x

}
public class exercise05 {

}
