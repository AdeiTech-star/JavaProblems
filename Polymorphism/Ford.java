package JavaProblems.Polymorphism;

public class Ford extends Car
{
  public Ford(int cylinders, String name)
  {
    super(cylinders, name);
  }
  //Override methods

  @Override
  public String startEngine()
  {
    return ("Ford -> startEngine()");
  }

  @Override
  public String accelerate()
  {
    return ("Ford -> accelerate()");
  }

  @Override
  public String brake()
  {
    return ("Ford -> brake()");
  }
}
