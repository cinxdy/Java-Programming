public class Student_main_ver6{
    public static void main(String[] args){
        int class_score     = 80;
        Student_ver2 sman   = new Student_ver2();
        sman.setdata("SuperMan",class_score);

        System.out.println("\n\nBefore");
        System.out.println("class_score is "+ class_score);
        sman.writeoutput();

        changetest(sman,class_score);

        System.out.println("\n\nAfter");
        System.out.println("class_score is "+ class_score);
        sman.writeoutput();

    }

    public static void changetest(Student_ver2 in_object, int class_score){
        int new_score = 40;
        in_object.setdata("BatMan",new_score);
        class_score = new_score;
    }
}