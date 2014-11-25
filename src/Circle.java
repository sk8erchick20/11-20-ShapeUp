// A Circle object represents a circle defined by a center point and a radius.
public class Circle
{
  Point center;
  double radius;
  public Circle()
  {
    center=new Point();
    radius=0;
  }
  public Circle(Point startpoint, Point endpoint)
  {
    center=startpoint;
    radius=startpoint.distance(endpoint);
  }
  public Circle(Point a, double b)
  {
    a=center;
    b=radius;
  }
  public double getRadius()
  {
    return radius;
  }
  public double area()
  {
    double area=radius*radius*Math.PI;
    return area;
  }
  public double circumference()
  {
    double circum=radius*2*Math.PI;
    return circum;
  }
  public double diameter()
  {
    double diam=radius*2;
    return diam;
  }
  public String toString()
  {
    return "["+center.toString()+"] "+radius;
  }
  public void translate(int i, int j)
  {
    center.translate(i, j);
  }
  public void changeRadius(double m)
  {
    radius+= m;
  }
}
