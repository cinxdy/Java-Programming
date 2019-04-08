public class InheritanceDemo2 {
    public static void main(String[] args) {
        Person p = new Person("Super Man");
        Student s = new Student("Super Man", 20180101);
        Undergraduate u = new Undergraduate("Super Man", 20180101, 1);
        p.writeOutput(); System.out.println(" ");
        s.writeOutput(); System.out.println(" ");
        u.writeOutput(); System.out.println(" ");
    }
}