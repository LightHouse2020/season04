package 凌志栋;

import java.lang.*;

abstract class Graph{
    double perimeter;
    double area;
    public abstract void CalculateArea();
    public abstract void CalculatePerimeter();
}


//三角形
class Triangle extends Graph{
    double base;
    double height;
    @Override
    public void CalculateArea(){
        this.area=0.5*base*height;
    }
    @Override
    public void CalculatePerimeter(){
        this.perimeter=base+2*height;
    }
}
//等腰三角形
class IsoscelesTriangle extends Triangle{
    double leg;
    double base;

    @Override
    public void CalculateArea() {
        double p=0.5*(leg+leg+base);
        this.area=Math.sqrt(p*(p-leg)*(p-leg)*(p-base));
    }

    @Override
    public void CalculatePerimeter() {
        this.perimeter=base+2*leg;
    }
}
//矩形
class rectangle extends Graph{
    double length;
    double width;

    @Override
    public void CalculateArea() {
        this.area=length*width;
    }

    @Override
    public void CalculatePerimeter() {
        this.perimeter=2*(length+width);
    }

}
//圆
class circle extends Graph{
    double radius;
    @Override
    public void CalculateArea() {
        this.area=Math.pow(this.radius,2.0)*Math.PI;
    }

    @Override
    public void CalculatePerimeter() {
        this.perimeter=2*this.radius*Math.PI;
    }

}
//椭圆
class ellipse extends Graph{
    double semi_major_axis;
    double semi_minor_axis;
    @Override
    public void CalculateArea() {
        this.area=Math.PI* semi_major_axis * semi_minor_axis;
    }

    @Override
    public void CalculatePerimeter() {
        this.perimeter=Math.PI*(3*(semi_major_axis+semi_minor_axis)-Math.sqrt((3*semi_major_axis+semi_minor_axis)*(semi_major_axis+3*semi_minor_axis)));
    }
}

public class exercise06 {
}
