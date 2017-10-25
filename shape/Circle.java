package shape;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Circle extends Shape {
  private double radius;
  public Circle(String n, Color c, double xx, double yy, double r) {
    super(n, c, xx, yy);
    radius = r;
  }

  @Override
  public double calcArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double calcPerimeter() {
    return Math.PI * 2 * radius;
  }

  @Override
  public String getType() {
    return "Circle";
  }

  @Override
  public void draw(Graphics g) {
    g.setColor(getColor());
    g.fillOval((int)getX(), (int)getY(), (int)(radius * 2), (int)(radius * 2));
  }

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
