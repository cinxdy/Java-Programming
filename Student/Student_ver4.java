public class Student_main_ver4{
    public static void main() {
        Student_ver2 sman = new Student_ver2();
        Student_ver2 sman2 = new Student_ver2();
        sman.setdata("SuperMan",80);
        sman2.setdata("SuperMan",80);
        sman.writeoutput();
        sman2.writeoutput();

        if(sman == sman2)
            System.out.println(">> Same!!");
        else
            System.out.println(">> Not same!!");
    }
}