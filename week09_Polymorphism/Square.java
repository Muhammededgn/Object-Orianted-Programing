package week09_Polymorphism;

public class Square extends Shape2D {
    
    Square(double widht){
        super(widht, widht);
    }

    @Override
    double getArea(){
        return widht*widht*widht;
    }
}
