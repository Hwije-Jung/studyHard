package javaStudy.collection.app;

public class Dot {
  Integer x,y;

  public Dot(Integer x, Integer y) {
    this.x = x;
    this.y = y;
  }

  public Integer getX() {
    return x;
  }

  @Override
  public String toString() {
    return "Dot{" +
            "x=" + x +
            ", y=" + y +
            '}';
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }
}
