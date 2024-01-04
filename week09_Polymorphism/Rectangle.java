package week09_Polymorphism;

public class Rectangle extends Shape2D {
    Rectangle(double height, double widht){
        super(height, widht);
    }
    
    @Override
    double getArea(){
        return height*widht/2.0;
    }
}
