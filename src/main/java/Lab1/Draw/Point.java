package Lab1.Draw;


public class Point extends Shape {

    public  Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public  void draw(){
        System.out.println("Drawing a shape Point in x=" + getX() + ", y="+ getY() + ", color - " + getColor());
    }
}

