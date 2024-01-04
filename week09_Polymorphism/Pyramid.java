package week09_Polymorphism;

public class Pyramid extends Shape3D{
    Pyramid(double height, double widht, double depth){
        super(height, widht, depth);
    }
    @Override
    double getArea() {
        return height*widht/2.0 ;
    }

    @Override
    double getVolume() {
        return getArea()*widht/3.0;
    }
}
