public class DisplayDemo{
  public static void main(String[] args){
    Measurable m;
    Measurable box = new Rectangle(5.0, 5.0);
    Measurable disc = new Circle(5.0);
    m = box;
    display(m);
    m = disc;
    display(m);
  }

  public static void display(Measurable figure){
    String name = figure.getName();
    double perimeter = figure.getPerimeter();
    double area = figure.getArea();
    System.out.println(name);
    System.out.println("Perimeter = " + perimeter + "; area = "+ area);
  }
}
