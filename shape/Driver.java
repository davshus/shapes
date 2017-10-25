package shape;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Driver {
    public static void main(String[] args) {
      ShapeCanvas canvas = new ShapeCanvas();
      canvas.addShape(new Triangle("meme", Color.red, 0, 200, 100, 200));
      System.out.println(canvas.getShapes().get(0));
      JFrame frame = new JFrame();
      frame.add(canvas);
      frame.setSize(400, 400);
      frame.setVisible(true);
    }
}
@SuppressWarnings("serial")
class ShapeCanvas extends Canvas {
  ArrayList<Shape> shapes;
  public ShapeCanvas() {
    super();
    shapes = new ArrayList<Shape>();
  }
  @Override
  public void paint(Graphics g) {
    for (Shape s : shapes) {
      s.draw(g);
    }
  }
  public ArrayList<Shape> getShapes() {
    return shapes;
  }
  public void addShape(Shape s) {
    shapes.add(s);
  }
}
