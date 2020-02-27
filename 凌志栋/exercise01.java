package 凌志栋;

class vehicle{
    int speed;
    int size;
    void move(){
        System.out.println("Moving.");
    };
    public void setspeed(int x){
        this.speed=x;
    }
    public void setsize(int x){
        this.size=x;
    }
    public void speedup(int x) {
        this.speed+=x;
    }
    public void speeddown(int x){
        this.speed-=x;
    }
}
public class exercise01 {
    public static void main(String[] args){
        vehicle Lexus=new vehicle();
        Lexus.setspeed(120);
        Lexus.setsize(500);
        System.out.println("speed:"+Lexus.speed);
        System.out.println("size:"+Lexus.size);
        Lexus.move();
        Lexus.speeddown(20);
        System.out.println("speed:"+Lexus.speed);
        Lexus.speedup(20);
        System.out.println("speed:"+Lexus.speed);
    }
}


