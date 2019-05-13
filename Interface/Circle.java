public class Circle implements Measurable{
  private double myRadius;
  public Circle(double radius){
    myRadius = radius;
  }
  public String getName(){
    return Circle.class.getSimpleName();
  }
  public double getPerimeter(){
    return 2 * Math.PI*myRadius;
  }
  public double getArea(){
    return Math.PI * myRadius * myRadius;
  }
  public double getCircumference(){
    return getPerimeter();
  }
}
