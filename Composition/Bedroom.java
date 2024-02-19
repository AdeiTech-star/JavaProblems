package JavaProblems.Composition;

/**
 * Instructions:5) Create a class with the name Bedroom.
 * This class contains eight member variables:
 * name of type String; wall1, wall2, wall3, wall4 of type Wall; ceiling of type Ceiling; bed of type Bed, and lamp of type Lamp.
 * The class constructor should accept all eight of the member variables as parameters, and there should also be two additional methods:
 * getLamp() which returns an object of type Lamp, and makeBed() which prints a message that the bed is being made and also calls the make() method in the Bed class.
 */
public class Bedroom
{
  private String name;
  private Wall wall1, wall2, wall3,wall4;
  private Ceiling ceiling;
  private Bed bed;
  private Lamp lamp;

  public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp)
  {
    this.name = name;
    this.wall1 = wall1;
    this.wall2 = wall2;
    this.wall3 = wall3;
    this.wall4 = wall4;
    this.ceiling = ceiling;
    this.bed = bed;
    this.lamp = lamp;
  }

  public Lamp getLamp()
  {
    return lamp;
  }

  public void makeBed()
  {
    System.out.println("Bed is being made ...");
    bed.make();

  }
}
