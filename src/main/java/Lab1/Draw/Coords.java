package Lab1.Draw;

public abstract class Coords {
    private static int x;

    private static int y;

    private static int r;


    public  int getX() {
        return x;
    }

    public void setX(int x) {
        Coords.x = x;
    }

    public  int getY() {
        return y;
    }

    public void setY(int y) {
        Coords.y = y;
    }

    public static int getR() {
        return r;
    }

    public void setR(int r) {
        Coords.r = r;
    }

    public  void draw() {
    }
}
