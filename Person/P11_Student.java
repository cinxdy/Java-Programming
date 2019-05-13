public class P11_Student extends P11_PersonAbstract implements P11_StudentInterface {
  private int studentNumber;
  private String courseName;

  public void learn() {System.out.println("I am taking" + courseName + " course.");}
  public void study() {System.out.println("I am studying " + courseName);}
  public P11_Student(){
    super();
    System.out.println("Student();");
    studentNumber = 0;
  }
  public P11_Student(String inName, int inSNum, String inCourse){
    super(inName);
    studentNumber = inSNum;
    courseName = inCourse;
  }
  public void writeOutput(){
    System.out.println("Name "+getName());
    System.out.println("Student Number: " + studentNumber);
    learn();
    study();
  }
}
