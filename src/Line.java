// A Line object represents a line defined by a pair of Points.
  public Line()
  {
    start=new Point();
    end=new Point();
  }
  public Line(Point intialstart, Point intialend)
  {
    start=intialstart;
    end=intialend;
  }
  public double length()
  {
    return start.distance(end);
  }
  public double slope()
  {
    return (start.getY()-end.getY())/(start.getX()-end.getX());
  }
  public String toString()
  {
    return "["+start.toString()+","+end.toString()+"]";
  }
  public void translate(int a, int b)
  {
    start.translate(a,b);
    end.translate(a, b);
  }
}
