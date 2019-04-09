public class Student_ver2{
    private String name;
    private int score;
    private String grade;
    public void writeoutput(){
        String grade;
        if(score > 50)  grade = "pass";
        else grade = "fail";

        System.out.println(name + ": "+score+": "+grade);
    }
    public int getScore() {return score;}
    public String getName() { return name;}
    public void setdata (String s_name,int s_score){
        name  = s_name;
        score = s_score;
    }
}