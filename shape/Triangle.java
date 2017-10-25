package shape;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Triangle extends Shape {
  double base, height;
  double[][] points;
  public Triangle(String n, Color c, double xx, double yy, double b, double h) {
    super(n, c, xx, yy);
    base = b;
    height = h;
    points = new double[3][2];
    recalcPoints();
  }

  private void recalcPoints() {
    points[0][0] = getX();
    points[0][1] = getY() + height;
    points[1][0] = getX() + base;
    points[1][1] = getY() + height;
    points[2][0] = getX() + (base / 2);
    points[2][1] = getY();
  }

  @Override
  public String getType() {
    return "Triangle";
  }

  @Override
  public double calcArea() {
    return (base * height) / 2;
  }

  @Override
  public double calcPerimeter() {
    return base + 2 * Math.sqrt(height * height + base * base / 4);
  }

  @Override
  public void draw(Graphics g) {
    g.setColor(getColor());
    int[] xPoints = new int[3];
    int[] yPoints = new int[3];
    for (int i = 0; i < 3; i++) {
      xPoints[i] = (int)points[i][0];
      yPoints[i] = (int)points[i][1];
    }
    g.fillPolygon(xPoints, yPoints, 3);
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double h) {
    height = h;
    recalcPoints();
  }

  public double getBase() {
    return base;
  }

  public void setBase(double b) {
    base = b;
    recalcPoints();
  }
}
