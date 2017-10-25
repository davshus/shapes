package shape;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Square extends Shape {
  private double sideLength;
  public Square(String n, Color c, double xx, double yy, double side) {
    super(n, c, xx, yy);
    sideLength = side;
  }

  @Override
  public void draw(Graphics g) {
    g.setColor(getColor());
    g.fillRect((int)getX(), (int)getY(), (int)sideLength, (int)sideLength);
  }

  @Override
  public double calcArea() {
    return sideLength * sideLength;
  }

  @Override
  public double calcPerimeter() {
    return sideLength * 4;
  }

  @Override
  public String getType() {
    return "Square";
  }

  public double getSideLength() {
    return sideLength;
  }

  public void setSideLength(double side) {
    sideLength = side;
  }
}
