public class Student_ver1{
  public String name;
  public int score;
  public String grade;
  public void writeoutput(){
    System.out.println(name+": "+score+": "+grade);
  }
  public void makegrade(){
    int class_score;
    class_score = this.score;
    if(class_score>50)
      this.grade = "pass";
    else
      this.grade = "fail";
  }
}
