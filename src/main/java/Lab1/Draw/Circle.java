package Lab1.Draw;

public class Circle extends Shape {


    public Circle(int x, int y, int r){
        setX(x);
        setY(y);
        setR(r);
    }

    public  void draw(){
        System.out.println("Drawing a shape Circle in x=" + getX() + ", y="+ getY() +", radius =" + getR() + ", color - " + getColor());
    }

}
