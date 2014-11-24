// A Point object represents a pair of (x, y) coordinates.
public class Point
{
  int x;
  int y;
  public double distanceFromOrigin()
  {
    double disorigin=Math.sqrt(x*x+y*y);
    return disorigin;
  }
  public double distance (Point p)
  {
    double dis=Math.sqrt(((x-p.x)*(x-p.x))+((y-p.y)*(x-p.y)));
    return dis;
  }
  public String toString()
  {
    return "("+x+","+y+")";
  }
  public void setX(int x1)
  {
    x=x1;
  }
  public void setY(int y2)
  {
    y=y2;
  }
  public void translate (int x1, int y1)
  {
    x+=x1;
    y+=y1;
  }
  public Point()
  {
    x=0;
    y=0;
  }
  public Point(int newx, int newy)
  {
    x=newx;
    y=newy;
  }
  public int getY()
  {
    return y;
  }
  public int getX()
  {
    return x;
  }
}
