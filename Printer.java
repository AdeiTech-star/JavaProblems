package JavaProblems;

/**
 * INSTRUCTIONS:
 * In this exercise you will create one class and name it Printer.
 * This class will have two member variables of type int, tonerLevel and pagesPrinted, and one of type boolean called duplex.
 * All three fields will have private access. The constructor will accept two of these variables, tonerLevel and duplex, as parameters following these rules:
 * tonerLevel must be greater than -1 but less than or equal to 100.
 * If it does not meet these conditions then it should be initialized to -1.
 * duplex should be initialized to the value of the parameter.
 * In addition, pagesPrinted should be initialized to 0.
 * Three other methods need to be defined in this way:
 * addToner will accept one parameter, tonerAmount of type int. First off, tonerAmount should be greater than 0 and less than or equal to 100.
 * If this condition is met a second test must be included to test whether tonerLevel plus tonerAmount is greater than 100. If so, the method should return -1.
 * If not then tonerLevel should have the incoming tonerAmount added to it and the new tonerLevel should then be returned by the method.
 * Also, if the initial condition test fails, then the method should return -1.
 * printPages will accept one parameter, pages of type int. A variable called pagesToPrint should be created and initialized to the value of the incoming parameter.
 * A conditional check should be performed on whether the Printer class field, duplex, is either "true" or "false".
 * If "true" then a calculation must be performed to determine the number of pages needed to print the job double sided.
 * The pagesToPrint value is then added to the class field pagesPrinted, but the value of pagesToPrint should be returned by the method.
 * getPagesPrinted has no parameters and merely returns the value of the member variable pagesPrinted.
 */
public class Printer
{
  private int tonerLevel;
  private int pagesPrinted = 0;
  private boolean duplex;

  public Printer(int tonerLevel, boolean duplex)
  {
    if(!(tonerLevel>-1 && tonerLevel <100)){
      tonerLevel = -1;
    }
    this.tonerLevel = tonerLevel;
    this.duplex = duplex;
  }


  public int addToner(int tonerAmount)
  {
    if((tonerAmount >0 && tonerAmount <100))
    {
      if(tonerAmount + tonerLevel > 100)
      {
        return -1;
      }
      tonerLevel += tonerAmount;
      return tonerLevel;
    }

    else{

    return -1;
  }
  }

  public int  printPages(int pages)
  {
    int pagesToPrint = pages;

    if(duplex == true)
    {
      pagesToPrint = (pages / 2)+(pages % 2); //to also account for the remaining pages


    }
    return pagesToPrint;

  }

  public int getPagesPrinted()
  {
    return pagesPrinted;
  }
}
