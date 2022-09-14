package Lab1.Draw;

public class Shape extends Coords{

  private String color="white";


  public void setColor(String color) {
    this.color = color;
  }


  public Shape() {
  }

  public  String getColor() {
        return color;
  }

  public void setColor() {
        this.color = color;
  }
  @Override
  public  void draw(){}
}
