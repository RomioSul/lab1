package Lab1.Draw;

public class Circle extends Shape {
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle(int x, int y, int r){
        setX(x);
        setY(y);
        setR(r);
    }

    public  void draw(){
        System.out.println("Drawing a shape Circle in x=" + getX() + ", y="+ getY() +", radius =" + getR() + ", color - " + getColor());
    }

}
