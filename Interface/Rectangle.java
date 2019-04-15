public class Rectangle implements Measurable{
  private double myWidth;
  private double myHeight;
  public Rectangle(double width, double height){
    myWidth = width;
    myHeight = height;
  }
  public String getName(){
    return Rectangle.class.getName();
  }
  public double getPerimeter(){
    return 2 *(myWidth + myHeight);
  }
  public double getArea(){
    return myWidth * myHeight;
  }
}
