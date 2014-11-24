// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
public class Rectangle
{
  Point origin;
  int width;
  int height;
  public Rectangle()
  {
    origin =new Point();
    width=0;
    height=0;
  }
  public Rectangle(Point bottomLeft, Point topRight)
  {
    origin=bottomLeft;
    width=topRight.getX()-bottomLeft.getX();
    height=topRight.getY()-bottomLeft.getY();
  }
  public Rectangle(Point bottomLeft, int a, int b)
  {
    origin=bottomLeft;
    width=a;
    height=b;
  }
  public Point getBottomLeft()
  {
    return origin;
  }
  public Point getTopRight()
  {
    Point TopRight = new Point(origin.getX()+width, origin.getY()+height);
    return TopRight;
  }
  public Integer getHeight()
  {
    return height;
  }
  public Integer getWidth()
  {
    return width;
  }
  public double area()
  {
    double area=height*width;
    return area;
  }
  public double diagonal()
  {
    double dia=origin.distance(getTopRight());
    return dia;
  }
  public Integer perimeter()
  {
    int perimeter=(height*2)+(width*2);
    return perimeter;
  }
  public boolean isSquare()
  {
    if(height==width)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public String toString()
  {
    return "[ "+origin.toString()+","+getTopRight().toString()+"]";
  }
  public void translate(int X, int Y)
  {
    origin.translate(X, Y);
  }
  public void scale(int dx, int dy)
  {
    height+= dy;
    width+= dx;
  }
}
