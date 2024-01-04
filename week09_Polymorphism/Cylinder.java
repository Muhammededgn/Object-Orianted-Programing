package week09_Polymorphism;

public class Cylinder extends Shape3D{
    Cylinder(double height, double radius){
        super(height, radius);
    }

    @Override
    double getArea(){
        return radius*radius*PI;
    }

    @Override
    double getVolume(){
        return getArea()*height;
    }
}
