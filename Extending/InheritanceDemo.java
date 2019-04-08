public class InheritanceDemo{
    public static void main(String[] args){
    Student s = new Student();
    Person p = s;
    s.setName("Super Man");
    s.setStudentNumber(19380001);
    s.writeOutput();
    p.writeOutput();
    }
}