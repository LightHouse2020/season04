package 凌志栋;

abstract class Vehicle{
    public abstract String NumberOfWheels();
}

class Motorbike extends Vehicle{
    public String NumberOfWheels(){
        String a="四轮车";
        return a;
    }
}
class Car extends Vehicle{
    public String NumberOfWheels(){
        String a="双轮车";
        return a;
    }
}
public class exercise04 {
    public static void main(String[] args){
        Car lexus=new Car();
        Motorbike yamato=new Motorbike();
        System.out.println(lexus.NumberOfWheels());
        System.out.println(yamato.NumberOfWheels());
    }
}
