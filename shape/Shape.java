package shape;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public abstract class Shape {
  private double x, y;
  private String name;
  private Color color;
  private static int shapeCount;
  public Shape(String n, Color c, double xx, double yy) {
    x = xx;
    y = yy;
    name = n;
    color = c;
    shapeCount++;
  }
  public abstract void draw(Graphics g);
  public abstract double calcArea();
  public abstract double calcPerimeter();
  public abstract String getType();
  public void finalize() {
    shapeCount--;
  }
  public String getName() {
    return name;
  }
  public void setName(String n) {
    name = n;
  }
  public Color getColor() {
    return color;
  }
  public void setColor(Color c) {
    color = c;
  }
  public double getX() {
    return x;
  }
  public void setX(double xx) {
    x = xx;
  }
  public double getY() {
    return y;
  }
  public void setY(double yy) {
    y = yy;
  }
  public String toString() {
    //the Name, Type, Area and Color of a Shape
    return "[" + getType() + " " + name + "] " + color + ", Area = " + calcArea();
  }
}
