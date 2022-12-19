interface Shape {
  double getArea();

  double getPerimeter();
}

public class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(5);
    double area = circle.getArea();
    double perimeter = circle.getPerimeter();
  }
}
