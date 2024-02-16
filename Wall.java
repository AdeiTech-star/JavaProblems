package JavaProblems;

public class Wall
{

  private double width;
  private double height ;

  public static void main(String[] args)
  {
   Wall wall = new Wall(5,4);
   System.out.println("area= " + wall.getArea());

   wall.setHeight(-1.5);
   System.out.println("width= " + wall.getWidth());
   System.out.println("height= " + wall.getHeight());
   System.out.println("area= " + wall.getArea());

  }


  //Constructors
  public Wall()
  {


  }

  public Wall(double width, double height)
  {
    setHeight(height);
    setWidth(height);
  }

  //Encapsulation:Getters and Setters


  public double getWidth()
  {
    return width;
  }

  public double getHeight()
  {
    return height;
  }

  public void setWidth(double width)
  {
    if(width<0)
    {
      this.width = 0;
    }
    else{

      this.width = width;
    }
  }

  public void setHeight(double height)
  {
    if(height<0)
    {
      this.height = 0;
    }
    else {

      this.height = height;
    }
  }

  public double getArea()
  {
    double area = (height * width);
    return area;
  }
}
