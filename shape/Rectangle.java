package shape;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rectangle extends Shape {
  private double width, height;
  public Rectangle(String n, Color c, double xx, double yy, double w, double h) {
    super(n, c, xx, yy);
    width = w;
    height = h;
  }

  @Override
  public void draw(Graphics g) {
    g.setColor(getColor());
    g.fillRect((int)getX(), (int)getY(), (int)width, (int)height);
  }

  @Override
  public double calcArea() {
    return width * height;
  }

  @Override
  public double calcPerimeter() {
    return 2 * width + 2 * height;
  }

  @Override
  public String getType() {
    return "Rectangle";
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double w) {
    width = w;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double h) {
    height = h;
  }
}
